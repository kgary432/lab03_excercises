#header read me !
from collections import Counter

def find_duplicates(nums):
count = Counter(nums)
return [num for num, freq in count.items() if freq > 1]

# Example usage:

nums = [1, 2, 3, 2, 4, 5, 3, 6, 6, 7]
duplicates = find_duplicates(nums)
print(duplicates) # Output: [2, 3, 6]
