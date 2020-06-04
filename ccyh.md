> 存储优化学习向导:
>
> - 内存存储 & 本地存储
> - 优化

## 内存存储 & 本地存储

### 内存储存

&emsp;&emsp;我们经常使用到对象来保存我们的数据到内存，数据量大的时候，我们通常会使用数组，链表，Set,Map,Stack等等，因此我们想要对内存进行一步节省我们必须采用合适的集合存储我们的数据。

### 本地存储

&emsp;&emsp;本地存储分以下方式:

- 文件存储
- SQLite
- SharedPreferences & MMKV
- 序列化 & 反序列化

当你选择某一样存储方式的时候，如果您存在多线程安全 & 多进程安全问题，例如SQLite能做到多线程安全吗，SQLite能做到多进程安全吗？这些是你必须考虑的因素。

## 优化

### 内存储存

- [SparseArray、ArrayMap](https://blog.csdn.net/hq942845204/article/details/81293480)
以上集合是Android专门定制的集合类，为什么单独封装出呢？那肯定是相对于Java原生的集合类，它作出了优化。
- 自己封装一套符合自己优化需求的集合类(这要求数据结构功底十分强)

### 本地存储优化

[Android 高质量开发之存储优化](https://blog.csdn.net/Android_SE/article/details/97010894)