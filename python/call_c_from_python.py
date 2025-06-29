# call_c_from_python.py
import ctypes

# Load the shared library
mylib = ctypes.CDLL('./libmylib.so')

# Call the function
result = mylib.add(5, 7)
print("Result from C function:", result)

