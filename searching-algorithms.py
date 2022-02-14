def linear_search(array, x):
  n = len(array) # array size
  for i in range(0,n):
    if array[i] == x: 
      return i
  
  return -1
  
def binary_search(sorted_array, x):
  n = len(sorted_array) # array size
  
  left = 0
  right = n - 1
  
  while left < right:
    mid = (left + right) / 2
    if (x > sorted_array[mid]):
      left = mid + 1
    else:
      right = mid
      
  if sorted_array[left] == x:
    return left 
  
  return -1