# JsoupSample
jsoupSample

使用`Jsoup`抓取一些网站的数据，抓取数据的网站已经列在下面，如果有侵权嫌疑，请及时联系我删除相关数据


## Tips

有的网络错误有可能是该网址地址变动导致的，需要查看Log输出来确定正确的错误原因。<br>
抓取规则一般不会出问题，除非网站改动Html命名方式

# android SDK 内存泄露

如图所示,这个Bug是Android输入法的Bug,输入法内存泄漏了.....

![](https://github.com/7449/JsoupSample/blob/master/screenshot/androidBug.png)


详情见：

[InputMethodManager内存泄露现象及解决](http://blog.csdn.net/sodino/article/details/32188809)<br>
[Android InputMethodManager 导致的内存泄露及解决方案](https://zhuanlan.zhihu.com/p/20828861?refer=zmywly8866)


* fiction

	>浏览小说
	
	[81中文网](http://www.81zw.com/book/8012/)<br>
	[笔趣阁](http://www.biqiuge.com/)<br>
	[零点看书](http://www.00ksw.net/)<br>
	[飘天文学](http://www.piaotian.com/)<br>

![](https://github.com/7449/JsoupSample/blob/master/screenshot/fiction_zw.gif)
![](https://github.com/7449/JsoupSample/blob/master/screenshot/fiction_search.gif)
		
* movie

	>抓取一些电影
	
	[dytt8](http://www.dytt8.net/index.htm)<br>
	[dy2018](http://www.dy2018.com/)<br>
	[xiaopian](http://www.xiaopian.com/html/)<br>
	[飘花](http://www.piaohua.com)<br>
	
![](https://github.com/7449/JsoupSample/blob/master/screenshot/movie.gif)

* image

	>抓取一些图片,收藏功能
	
	[豆瓣美女](http://www.dbmeinv.com/)<br>
	[妹子图](http://www.mzitu.com/)<br>
	[MM](http://www.mmjpg.com/)<br>
	[MEIZITU](http://www.meizitu.com/)<br>
	[7kk](http://m.7kk.com/)<br>

![](https://github.com/7449/JsoupSample/blob/master/screenshot/image.gif)
![](https://github.com/7449/JsoupSample/blob/master/screenshot/image_search.gif)

* magnetic

    >磁力链接抓取
    
    [BT蚂蚁](http://www.btans.com)<br>
    [BT樱桃](http://www.btcherry.info)<br>
    [尼玛搜](https://www.nimasou.info)<br>
    [BT蜘蛛](http://www.zhizhucili.cc)<br>
    [屌丝搜](http://www.diaosisou.net)<br>
    [磁力链](http://cililian.me)<br>
    
    
   
	
整个框架围绕着`commonLibrary`这个`modules`展开。

里面包含了`jsoup`开发的常用控件以及`MVP`的Base类。

## 框架介绍：

* base

	包含了基本的`BaseActivity` `BaseFragment` 之类的基类
	
* util

	网络加载，html加载，图片，UI类的方法
	
* widget

	包括了 自适应高度的`ImageView`,可检测滑动底部的`RecyclerView` 等等 一些控件
	
## 非常感谢以下开源框架：

> [jsoup](http://www.open-open.com/jsoup/)

	获取Html内容

> [android](https://developer.android.com/index.html)
		
	android
		
> [glide](https://github.com/bumptech/glide)
		
	加载图片
		
> [rxJsoupNetWork](https://github.com/7449/RxNetWork/tree/RxJsoupNetWork)

	Jsup加载网络框架
	
> [klog](https://github.com/ZhaoKaiQiang/KLog)

    打印Log
	
> [flexbox](https://github.com/google/flexbox-layout)

    flexbox-layout
	
> [TouchImageView](https://github.com/MikeOrtiz/TouchImageView)

    可双击或者触摸放大缩小的ImageView

> [GreenDao](https://github.com/greenrobot/greenDAO)

    数据库操作

> [jiecaoVideo](https://github.com/lipangit/JieCaoVideoPlayer)
    	
	视频播放

> [RxJava](https://github.com/ReactiveX/RxJava)
> [RxAndroid](https://github.com/ReactiveX/RxAndroid)
