> 内存优化学习向导:
>
> - 认识Android虚拟机Dalvik & ART
> - 对象 & 类 的生命周期
> - GC回收算法
> - Java中的四种引用
> - 认识内存泄漏 & 内存抖动 & 内存溢出 & 常见的场景
> - 如何检测出内存泄漏
> - 内存优化方案

## 认识Android虚拟机Dalvik & ART

[Android虚拟机Dalvik](https://www.cnblogs.com/larrylawrence/p/3815691.html)  
[Andoid虚拟机ART](https://www.jianshu.com/p/45c2686275c6)

大致了解即可，无需全部弄懂

## 对象 & 类 的生命周期

[java对象生命周期和类生命周期](https://blog.csdn.net/qq_25005909/article/details/78981512)

## GC回收算法

[Java中的GC回收算法](https://www.cnblogs.com/makor/p/base-algorithm-for-gc.html)
[Android中的GC回收算法](https://blog.csdn.net/zeyu_rensheng/article/details/81098536)

## Java中的四种引用

[Java中的四种引用](https://www.cnblogs.com/pascall/p/10281775.html)

## 认识内存泄漏 & 内存抖动 & 内存溢出 & 常见的场景

[内存泄漏](https://www.jianshu.com/p/ac00e370f83d)  
[内存抖动](https://www.pianshen.com/article/7279392753/)  
[内存溢出](https://zhuanlan.zhihu.com/p/54656524)

补充:
以上文章比并不能将内存泄漏，抖动，溢出的场景概括完，项目不同，出现的场景不同，但是大相径庭。

## 如何检测出内存泄漏

[Android内存泄漏检测和定位](https://www.jianshu.com/p/1972a6d1f0fc)

## 内存优化方案

- 内部类持有外部类引用导致的内存泄漏(例如Handler)--->采用静态弱引用方式进行改进  
[代码示例](https://github.com/Ellen2018/AndroidOp/blob/master/app/src/main/java/com/ellen/androidop/NcxlActivity.java)

- 大图加载导致的内存溢出--->因为屏幕有限，因此封装一套边回收边加载图片机制的算法，回收的是用户滑出去的图片数据，加载的是用户滑进屏幕的图片数据，在Andoid中BitmapRegionDecoder能完成这样的算法。

- 自定义View时，在某些经常调用的方法进行局部new对象导致的内存抖动--->解决方法,将局部new对象改成全局new对象,反正不能在此方法中new对象

- 使用Bitmap时没有及时调用recycler方法导致的内存泄漏--->当你的Bitmap使用完成了之后，不调用recycler方法，就不会对native(C、C++)区数据进行回收,尽管有些版本Bitmap数据不会放在Native,但是你还是必须得调用这个方法，理由请你深思一下，笔者就不啰嗦了。

还有很多很多场景，关键优化在于我们如何检测出它的存在，然后分析为什么会导致泄漏，接着就想出方案去解决它。


