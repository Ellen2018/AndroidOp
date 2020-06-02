> UI卡顿优化学习向导:  
> 
> - ANR & ANR产生的原理
> - ANR的时间问题
> - 如何检测卡顿的产生
> - UI卡顿优化方案

## ANR & ANR产生的原理

[Android ANR 知多少](https://www.cnblogs.com/wangjie1990/p/11327055.html)

## ANR 时间问题

> Activity  
> 无论前后台均为5s

> BroadcastReceiver  
> 前台:10s  
> 后台:60s

> ContentProvider  
> 无论前后台均为10s  

> Service  
> 前台：10s  
> 后台: 200s

> InputDispatching Timeout  
> 无论前后台均为5s

[参考链接](https://blog.csdn.net/houxian1103/article/details/90232704)

## 如何检测卡顿的产生？  

[Android UI性能优化 检测应用中的UI卡顿](https://blog.csdn.net/lmj623565791/article/details/58626355)  
[Android UI卡顿监测框架BlockCanary原理分析](https://www.jianshu.com/p/e58992439793)  

## UI卡顿优化方案

- Activity 启动时，尽量不要太耗时，也就是在onCreate,onStart,onResume里不要做太过于耗时的操作
- 加载大文件时开启线程进行加载，注意最好使用线程池
- ViewPager + Fragment搭配使用时Fragment进行懒加载
- 减少布局层级(合理使用布局标签< merge >,< viewstub >)
- ListView 或者 RecyclerView 优化，Item布局不要层级过多，显示Item数据时不要太耗时
- 有时内存抖动也会引起卡顿问题
- ......

&emsp;&emsp;优化点有很多很多，但其核心就是不要在主线程做耗时任务，这里笔者难以将优化点列全，我也做不到全部列全，读者一旦发现卡顿，只能依据自己的思维审视自己的代码，哪些位置的代码在主线程太过于耗时导致卡顿，然后找到优化方案进行解决。