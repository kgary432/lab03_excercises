#header read me !
from collections import Counter

def find_duplicates(nums):
count = Counter(nums)
return [num for num, freq in count.items() if freq > 1]

# Example usage:

nums = [1, 2, 3, 2, 4, 5, 3, 6, 6, 7]
duplicates = find_duplicates(nums)
print(duplicates) # Output: [2, 3, 6]

The nested loop solution compares each element in the list with every other element to find duplicates, resulting in a time complexity of O(n²) but using minimal space (O(1)). The dictionary/map-based solution tracks element counts using a dictionary, providing a more efficient O(n) time complexity at the cost of higher space complexity (O(n)). The nested loop is simpler but slower for large lists, while the dictionary method is faster and more scalable.

The nested loop solution involves iterating through a list and comparing every entry to every other entry excluding itself. If a duplicate is found it is appended to am ampty list of duplicates and by the end the list is returned.
In the set based solution you initialize two sets, seen and duplicates. Itarate over the list, if the element is in seen then add it to duplicates, if not add it to seen. By the end return the duplicate set.
