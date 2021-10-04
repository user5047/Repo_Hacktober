import math
def isPrime(num):
  result = True
  for i in range(2, int(math.sqrt(num))+1):
    if num%i == 0:
      result = False
      break
    else:
      continue
  if result:
    print("Prime Number")
  else:
    print("Not a Prime Number")
