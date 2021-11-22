# 个人博客项目

SpringBoot + MyBatis + Jquery + Thymeleaf 模板 + Semantic UI + Maven 等技术实现

部分功能参考了以下链接中的博客，同时页面参照该博客进行了修改，地址为：https://onestar.newstar.net.cn/


## 介绍

- 博客前端页面：里面有关于博客前端页面和后台管理页面的源码。

- myblog1.0：使用SpringBoot + MyBatis等技术实现

- 版本更新中.......

## 博客教程

- 前端页面介绍【一】
- 数据库设计【二】

- 框架搭建与实体类构建【三】
- 后台登录功能的实现【四】
- 后台分类和标签管理的实现【五】
- 后台博客管理的实现【六】
- 后台友链和相册管理的实现【七】
- 前端首页展示的实现【八】
- 前端文章详情页的实现【九】
- 前端博客详情评论、留言功能的实现【十】
- 前端分类、归档、关于我、音乐盒、照片墙功能的实现【十一】

## 二、技术栈介绍

### 前端技术

- JQuery框架（[地址](https://www.jsdelivr.com/)）
- CSS框架【[Semantic UI](https://semantic-ui.com/)】

- 【插件】[Markdown编辑器](https://pandao.github.io/editor.md/)

- 【插件】[网页排版typo](https://github.com/sofish/typo.css)

- 【插件】[代码高亮prism](https://github.com/PrismJS/prism)

- 【插件】[目录生成tocbot](https://tscanlin.github.io/tocbot/)

- 【插件】[二维码生成qrcode](https://davidshimjs.github.io/qrcodejs/)

- 【插件】[平滑滚动scrollto](https://cdn.jsdelivr.net/npm/jquery.scrollto@2.1.2/jquery.scrollTo.min.js)

- 【插件】[弹框插件waypoints]()

- 【插件】[动画效果animate.css](https://daneden.github.io/animate.css/)

- 【插件】[音乐盒zplayer](https://gitee.com/supperzh/zplayer)

- 【插件】[照片lightbox](https://github.com/JavaScript-Kit/jkresponsivegallery)

### 后端技术

- 【核心框架】SpringBoot 2.3.4

- 【持久层框架】Mybatis 2.1.3

- 【项目构建】JDK1.8、Maven 3.5.4

- 【模板引擎】Thymeleaf
- 【分页插件】PageHelper

- 【加密方式】MD5加密
- 【数据源】阿里的Druid数据源
- 【日志】使用Spring的AOP技术添加日志功能

### 数据库

- MySQL 5.7

建表Sql在myblog1.0中，登录账号：oldou  密码：123

## 三、功能介绍

本博客主要分为普通用户和管理员用户两种角色，以下分别介绍一下两种角色所拥有的功能。

### 普通用户

不需要登录，相当于游客一样，具有以下功能：

- **查看文章信息**：分页查看文章列表、推荐列表、文章标题以及内容、访问量、评论数、评论文章、赞赏文章等功能
- **查看分类信息**：查看分类列表、查看分类下的所有文章信息
- **查看归档**：查看按照发布时间顺序查看文章信息

- **听音乐**：选择列表中的音乐、播放音乐、调节音量大小、查看歌词等等

- **留言**：查看留言、留言、回复留言

- **查看照片墙**：查看照片列表、照片名称、照片的时间地点以及描述等信息
- **查看友链**：查看友链列表、点击友链访问该友链的博客

- **查看关于我**：查看关于博主的信息介绍

- **搜索文章**：输入对应信息搜索相关的文章信息

### 管理员用户

**拥有普通用户的所有功能**，同时登录成功之后可以管理博客，详细功能如下所示：

- **登录与注销**：进入登录页面，输入正确的用户名和密码登录成功后访问管理系统，同时也可以注销退出登录状态

- **文章管理**：新增文章、修改文章、删除文章、查询文章列表、根据文章的标题或者分类查询文章
- **分类管理**：新增分类、修改分类、删除分类、查询分类列表
- **标签管理**：新增标签、修改标签、删除标签、查询标签列表（该功能尚未添加到显示界面）
- **友链管理**：新增友链、修改友链、删除友链、查询友链列表
- **相册管理**：新增照片、修改照片、删除照片、查看照片列表



## 四、思维导图

![博客系统思维导图](https://img-blog.csdnimg.cn/20200926041341627.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzI0NjIxNQ==,size_16,color_FFFFFF,t_70#pic_center)











