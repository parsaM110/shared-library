classic trade-off between **control and convenience**.

**JNI (Java Native Interface)** is the traditional, low-level way to call native code (like `.so` files) from Java. It gives you **fine-grained control** but requires:
- Writing native C/C++ code as a bridge.
- Compiling that code for each platform.
- Managing memory and type conversions manually.

**JNA (Java Native Access)**, on the other hand, is a higher-level library that lets you call native functions **directly from Java**, without writing any C/C++ glue code. It:
- Uses reflection and dynamic proxies to map Java interfaces to native libraries.
- Handles most type conversions for you.
- Greatly reduces boilerplate and development time.

### Key Differences:
| Feature | JNI | JNA |
|--------|-----|-----|
| Setup | Requires native code and compilation | Java-only, no native code needed |
| Performance | Faster (less overhead) | Slower (due to reflection and type mapping) |
| Ease of Use | Complex | Much simpler |
| Flexibility | Full control over native interaction | Limited to what JNA supports |

So if you're optimizing for **performance**, JNI is the way to go. But if you're prioritizing **developer productivity and simplicity**, JNA can save you a lot of time.

## Sources
- https://github.com/java-native-access/jna
