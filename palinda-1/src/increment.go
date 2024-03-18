package main

import (
	"fmt"
	"sync"
	"time"
)

// En struct för att hantera värdet säkert
type SafeVal struct {
	val   int        // Värdet
	mutex sync.Mutex // Mutex-lås
}

// Ökar 'a.val' med 'n'
func (a *SafeVal) increment(n int) {
	for i := 0; i < n; i++ {
		a.val++
	}
}

func main() {
	sv := new(SafeVal) // Skapa ny SafeVal-instans
	numWorkers := 3
	incrementCount := 100

	for i := 0; i < numWorkers; i++ {
		go sv.increment(incrementCount) // Starta gorutin
	}

	time.Sleep(1000) // Vänta så att alla gorutiner blir klara

	// Printa värden
	fmt.Println("value:", sv.val)
	fmt.Println("expected:", numWorkers*incrementCount)
}
