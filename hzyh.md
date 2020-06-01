> 绘制优化学习向导:  
> 
> - 认识CPU & GPU
> - 认识Android过度绘制
> - 认识Android绘制 & 刷新
> - 认识冷启动 & 热启动
> - Android 绘制优化方案

## 认识CPU & GPU

[GPU入门](https://www.cnblogs.com/hutao886/p/6702098.html)  
[视频讲解](https://www.bilibili.com/video/BV165411x7Sq?from=search&seid=15598905951028601162)

通过此链接，您需要了解CPU和GPU的区别。

## Android 过度绘制

[过度绘制](https://blog.csdn.net/zxc123e/article/details/71750786)

通过此链接，您需要了解

- 如何判断您的布局过度绘制了
- 为什么布局层级不能太深？

## Android 绘制 & 刷新

[UI绘制过程](https://www.cnblogs.com/joahyau/p/11294970.html)  
[UI刷新机制](https://zhuanlan.zhihu.com/p/114097314)  

通过此链接，您需要了解： 

- Android的UI绘制大致流程 
- Android的刷新机制VSync信号的原理
- 理解UI卡顿产生的原因

## 冷启动 & 热启动

[冷启动 & 热启动](https://www.cnblogs.com/sppzcr/p/11498038.html)

通过此链接，您需要了解： 

- 理解冷启动和热启动的区别
- 冷启动优化的重要性
- 冷启动的流程
- 热启动的流程

## Android 绘制优化方案

### 优化点一:减少布局层次

- [使用标签< include >,< merge >,< viewstub >进行优化](https://www.trinea.cn/android/layout-performance/)  
- 尽量使用 约束布局 & 相对布局 & 帧布局

### 优化点二:冷启动优化  

- [冷启动优化](https://blog.csdn.net/qq_435559203/article/details/83719881)

注意：关于优化方案并没有统一的说法，我们要根据自己的技术能力以及借助网上一些博客对自己项目进行理性分析，从而找出合理的优化方案，这需要积累。

### 优化点三:UI卡顿优化

- 如何检测出UI卡顿?     
  [Android UI性能优化 检测应用中的UI卡顿](https://blog.csdn.net/lmj623565791/article/details/58626355)  
  [blockcanary神器](https://github.com/markzhai/AndroidPerformanceMonitor)

- [UI卡顿优化总结](https://zhuanlan.zhihu.com/p/27065828)
- [WebView单进程模式](https://www.jianshu.com/p/8ed995016fde)

