class Solution {
        public int nthUglyNumber(int n) {
                int[] primes = {2, 3, 5};  // Initialize the primes array
                        int[] indices = {0, 0, 0}; // Initialize indices for multiples of 2, 3, 5
                                List<Integer> uglyArr = new ArrayList<>();  // Initialize the ugly number array with 1
                                        uglyArr.add(1);

                                                for (int i = 1; i < n; ++i) {
                                                            // Calculate the next possible ugly numbers
                                                                        int[] nextUglies = {
                                                                                        uglyArr.get(indices[0]) * primes[0],
                                                                                                        uglyArr.get(indices[1]) * primes[1],
                                                                                                                        uglyArr.get(indices[2]) * primes[2]
                                                                                                                                    };
                                                                                                                                                int minValue = Math.min(nextUglies[0], Math.min(nextUglies[1], nextUglies[2]));  // Find the smallest value
                                                                                                                                                            uglyArr.add(minValue);  // Append the smallest value to uglyArr

                                                                                                                                                                        // Update indices for primes that generated the current min_value
                                                                                                                                                                                    for (int j = 0; j < 3; ++j) {
                                                                                                                                                                                                    if (nextUglies[j] == minValue) {
                                                                                                                                                                                                                        indices[j]++;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                    return uglyArr.get(n - 1);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        }


