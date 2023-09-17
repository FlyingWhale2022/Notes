# 1、Git简介

## 1.1、Git是什么？

> Git是一个[免费的开源](https://git-scm.com/about/free-and-open-source) [分布式](https://so.csdn.net/so/search?q=分布式&spm=1001.2101.3001.7020)版本控制系统，旨在快速高效地处理从小型到大型项目的所有内容。
>
> Git [易于学习](https://git-scm.com/doc)， [占地面积小，具有闪电般的快速性能](https://git-scm.com/about/small-and-fast)。它具有Subversion，CVS，Perforce和ClearCase之类的SCM工具，具有[廉价的本地分支](https://git-scm.com/about/branching-and-merging)，方便的[暂存区域](https://git-scm.com/about/staging-area)和 [多个工作流等功能](https://git-scm.com/about/distributed)。

## 1.2、Git有哪些优势？

> 官方的讲：
>
> 从一般开发者的角度来看，git有以下功能：
>
> 1、从服务器上克隆完整的Git仓库（包括代码和版本信息）到单机上。
>
> 2、在自己的机器上根据不同的开发目的，创建分支，修改代码。
>
> 3、在单机上自己创建的分支上提交代码。
>
> 4、在单机上合并分支。
>
> 5、把服务器上最新版的代码fetch下来，然后跟自己的主分支合并。
>
> 6、生成补丁（patch），把补丁发送给主开发者。
>
> 7、看主开发者的反馈，如果主开发者发现两个一般开发者之间有冲突（他们之间可以合作解决的冲突），就会要求他们先解决冲突，然后再由其中一个人提交。如果主开发者可以自己解决，或者没有冲突，就通过。
>
> 8、一般开发者之间解决冲突的方法，开发者之间可以使用pull 命令解决冲突，解决完冲突之后再向主开发者提交补丁。

> 我们自己讲：
>
> - 大部分操作在本地完成，无需联网
> - 保证了完整性
> - 尽可能地添加数据，而不是修改或者删除数据
> - 分支操作非常快捷、流畅
> - 与Linux命令全面兼容（同一个爹）

# 2、安装Git

> 下载地址：[Gei官方地址](https://git-scm.com/)
>
> 下载慢的可以借鉴：[淘宝Git镜像](https://npm.taobao.org/mirrors/git-for-windows/v2.25.0.windows.1/)

**安装目录：**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70.png)

**Next：**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373731.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373742.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373753.png)

**注意：**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373754.png)

![img](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373755.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373756.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373767.png)

![img](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373768.png)

![img](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-16686582373769.png)

# 3、Git结构

## 3.1、工作区

> 写代码；我们写代码的地方

## 3.2、暂存区

> 临时存储；打算提交的东西，但是暂时还没提交，暂时先存在这儿，后续可以提交到本地库，也可以撤回来

## 3.3、本地库

> 历史版本

## 3.4、如何使用

> 工作区 ----git add ----暂存区 ----git commit ----工作区

## 3.5、Git和托管中心

> 托管中心作用：维护远程库

> - 局域网环境下
>   - GitLab服务器
> - 外网环境下
>   - GitHub
>   - 码云

## 3.6、本地库和远程库

- 团队内部协作
- 跨团队协作

# 4、Git命令行操作

## 4.1、本地库操作

### 4.1.1、本地库初始化

**创建项目：**

```shell
#mkdir 项目名
mkdir HelloWord

```

**初始化命令：**

```shell
git init

```

**效果：**

![img](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823737610.png)

**注意：**

> .git目录中存放的是本地库相关的子目录和文件，不要删除 ，也不要胡乱修改

#### 4.1.1.1、设置签名

- 签名形式：
  - 用户名：Tom
  - Email地址：kjljd@qq.com -------------------------> 用户名和邮箱不用一致，邮箱错误也可以，不会发邮 件，仅仅是一个身份的代表，相当于id-
- 签名作用：
  - 区分开发人员的身份
- 辨析：
  - 这里的 签名用户名和Email、 和 登录远程库（代码托管中心）dd额账号和密码没有关系

> 设置签名命令：
>
> - 项目级别/仓库级别：仅在当前本地库范围有效
>
> ```shell
> #git config user.name 用户名
> #git config user.email 邮箱
> git config user.name tom_pro
> git config user.email goodMoring_pro@163.com
> 
> cat .git/config		---------------------->项目级别的信息保存目录
> 
> ```
>
> - 系统用户级别：登录当前操作系统的用户范围
>
> ```shell
> #git config --global user.name 用户名
> #git config --global user.email 邮箱
> git config --global user.name tom_glo
> git config --global user.email goodMoring_glo@163.com
> 
> cat ~/.gitconfig		---------------------->系统级别的信息保存目录
> 
> ```
>
> - 优先级：
>   - 就近原则，项目级别>系统级别

**示范：项目级别**

![img](Git笔记version1.assets/20200302211614276.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823737711.png)

**示范：系统级别**

![在这里插入图片描述](Git笔记version1.assets/2020030221171821.png)

![在这里插入图片描述](Git笔记version1.assets/20200302211729481.png)

### 4.1.2、全局相关设置

#### 4.1.2.1、查看全局配置

```shell
git config --list
```

#### 4.1.2.2、设置全局签名

```shell
git config --global user.name "输入你的用户名"
git config --global user.email "输入你的邮箱"
```

#### 4.1.2.3、修改全局配置

```shell
git config --global --replace-all user.name "输入你的用户名"
git config --global --replace-all user.email "输入你的邮箱"
```

### 4.1.2、基本操作

#### 4.1.2.1、查看的状态

```shell
git status
```

![在这里插入图片描述](Git笔记version1.assets/20200302211748608.png)

#### 4.1.2.2、创建文件

```shell
#vim [File Name]
vim good.txt
```

![在这里插入图片描述](Git笔记version1.assets/20200302211804374.png)
**创建文件后查看状态：**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823737812.png)

#### 4.1.2.3、工作区添加到暂存区

```bash
#git add [File Name]
git add good.txt
```

![在这里插入图片描述](Git笔记version1.assets/20200302211905479.png)

**添加后查看状态：**

![在这里插入图片描述](Git笔记version1.assets/20200302211917305.png)

#### 4.1.2.4、从缓存区撤回

```shell
#git rm --cached [File Name]
git rm --cached good.txt
```

![在这里插入图片描述](Git笔记version1.assets/20200302211929589.png)

#### 4.1.2.5、暂存区提交到本地库

```shell
#第一种提交：git commit [File Name]
git commit good.txt
#常用提交：git commit -m "[commit message]" [File Name]
git commit -m "My second commit,modify good.txt" good.txt

```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823737813.png)
![在这里插入图片描述](Git笔记version1.assets/20200302212010747.png)

**提交之后查看：**

![在这里插入图片描述](Git笔记version1.assets/20200302212034942.png)

#### 4.1.2.6、修改文件后情况

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823737914.png)

**添加到暂存区：**

![在这里插入图片描述](Git笔记version1.assets/20200302212100801.png)

**提交到本地库：**

![在这里插入图片描述](Git笔记version1.assets/20200302212112738.png)

#### 4.1.2.7、查看历史记录【版本】控制

**历史记录直观感受：**

```shell
git log
```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823737915.png)

如果日志信息【版本】很多，会导致一屏放不下(需要**空格向下翻页，b向上翻页，q退出**)，使用下面的命令，会变得好一点

```shell
git log --pretty=oneline 1、只显示完整的版本号和版本信息并且放在一行 2、只显示历史版本
git log --oneline	1、只显示部分版本号和版本信息并且放在一行 2、只显示历史版本
git reflog			1、只显示部分版本号和版本信息并且放在一行，其中 HEAD@{n}表示回到该版本head指针需要向后移动n步 2、显示所有版本

```

![在这里插入图片描述](Git笔记version1.assets/20200302212138374.png)

![在这里插入图片描述](Git笔记version1.assets/20200302212148486.png)

![在这里插入图片描述](Git笔记version1.assets/20200302212203875.png)

#### 4.1.2.8、前进后退历史记录

##### 4.1.2.8.1、基于索引值操作【推荐】

```shell
#git reset --hard [索引]
git reset --hard 51d4ed9
12
```

![在这里插入图片描述](Git笔记version1.assets/20200302212244452.png)

hard和soft和mixed参数对比

- –soft
  - 仅仅在本地库移动HEAD指针
- –mixed
  - 在本地库移动指针
  - 重置缓存区
- –hard
  - 本地库移动指针
  - 重置缓存区
  - 重置工作区

##### 4.1.2.8.2、使用^符号

> 只能往后，不能往前，一个^符号，表示退一步

```shell
git reset --hard HEAD^
git reset --hard HEAD^^
git reset --hard HEAD^^^
……
git reset --hard HEAD^^^^…………^^
12345
```

##### 4.1.2.8.3、使用~符号

```shell
git reset --hard HEAD~3
git reset --hard HEAD~10     ---->相当于10和^符号
12
```

#### 4.1.2.9、删除文件并找回

删除文件

```shell
rm [File Name]
rm aaa.txt
将工作区的删除操作提交至暂存区
将暂存区的删除操作提交至本地库
```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738016.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738017.png)

**版本回退，找回文件**

找回的前提:删除前,文件存在时的状态提交到了本地库。

操作: git reset-hard[指针位置]

- 删除操作已经提交到本地库:指针位置指向历史记录
- 删除操作尚未提交到本地库:指针位置使用HEAD

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738018.png)

#### 4.1.2.10、文件比较

```shell
#git diff [File Name]--------------->将工作区的文件和暂存区的对应文件进行比较 
git diff apple.txt
#git diff [本地库版本] [File Name]--------------->将工作区的文件和本地库记录进行比较  
$ git diff HEAD apple.txt
#git diff [本地库版本] --------------------> 将工作区的所有文件和本地库记录进行比较 
```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738019.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738120.png)

### 4.1.3、分支管理

<img src="Git笔记version1.assets/image-20221118105225081.png" alt="image-20221118105225081" style="zoom:80%;" />

分支的好处：

- 同时并行推进多个功能开发,提高开发效率
- 各个分支再开发过程中,如果一个分支开发失败,不会对其他分支有任何影响,失败的分支删除重新开始即可

#### 4.1.3.1、查看所有分支

```shell
git branch -v

```

![在这里插入图片描述](Git笔记version1.assets/20200302212503686.png)

#### 4.1.3.2、创建分支

```shell
#git branch [分支]
git branch hot_fix

```

![在这里插入图片描述](Git笔记version1.assets/20200302212514990.png)

#### 4.1.3.3、删除分支

```shell
#git branch -D [分支名]
git branch -D asd
12
```

![在这里插入图片描述](Git笔记version1.assets/2020030221253043.png)

#### 4.1.3.4、切换分支

```shell
#git checkout [分支]
git checkout hot_fix
12
```

![在这里插入图片描述](Git笔记version1.assets/2020030221255089.png)

#### 4.1.3.5、合并分支

> 合并之前：两条分支的版本都是一样的

![在这里插入图片描述](Git笔记version1.assets/20200302212607493.png)

> 现在，在hot_fix分支上模拟“修改，调试Debug完成后”，并且Add、commit到本地库之后，两条分支版本不同了。

![在这里插入图片描述](Git笔记version1.assets/20200302212628800.png)

> 现在就需要合并到一起，让主分支的版本也向前推进到Debug之后的版本。
>
> **合并分支：**
>
> - 第一步：切换到接受修改的分支（被合并，增加新内容）上
>
> - 第二步：执行merge命令
>
>   - ```shell
>     #git merge [与那个分支合并:分支名]
>     git merge hot_fix
>     12
>     ```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738221.png)
![在这里插入图片描述](Git笔记version1.assets/20200302212740723.png)

#### 4.1.3.6、解决冲突

> 冲突发生场景：对**同一文件**，分别在两条分支上都做了修改并产生了两个新版本（版本1 和版本2），当将版本 2 合并到版本 1 所在的分支上时，会产生冲突。
>
> **注意**：如果是对同一版本的**不同的文件**，分别在在两条分支上做了修改并产生了两个新版本（版本1 和版本2），当将版本 2 合并到版本 1 所在的分支上时，**不会产生冲突**。此时会将版本1 和版本 2 的**修改融合**，**生成一个新版本**（版本3 ）合并到分支上。

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738222.png)

> 解决：
>
> - 第一步：编辑文件，删除特殊符号
> - 第二步：把文件修改到满意程度，保存退出
> - 第三步：git add [文件名]
> - 第四步：git commit -m “日志信息”
>   ![在这里插入图片描述](Git笔记version1.assets/20200302212850177.png)![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738223.png)

## 4.2、远程库操作

### 4.2.1、初始化本地库

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738324.png)

### 4.2.2、创建远程库

> 登录GitHub，注意：创建远程库的名字，的时候，可以和本地库名字不同，这里方便演示，起名一致

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738325.png)

### 4.2.3、查看本地库地址别名

```shell
git remote -v

```

![在这里插入图片描述](Git笔记version1.assets/20200302213005146.png)

### 4.2.4、在本地库创建远程库的别名（关联远程仓库）

```shell
#git remote add [别名] [地址]
git remote add HelloProject https://github.com/MissLi-1/HelloWord.git
12
```

![在这里插入图片描述](Git笔记version1.assets/20200302213028135.png)

![在这里插入图片描述](Git笔记version1.assets/20200302213038859.png)

### 4.2.5、推送操作

```shell
#git push [地址的别名] [那个分支]
git push HelloProject master
12
```

![在这里插入图片描述](Git笔记version1.assets/20200302213100867.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738426.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738427.png)

> 此时页面就会有：我们本地库刚才推送的文件

### 4.2.6、克隆远程库文件

> ```shell
> #git clone [远程库地址]
> git clone https://github.com/MissLi-1/HelloWord.git
> 12
> ```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738428.png)

> - 克隆OK好后，它会自己做好这些东西
>   - 完整的远程库下载到本地
>   - 创建远程地址别名
>   - 初始化本地库

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738429.png)

### 4.2.7、邀请别人加入自己的团队

> 场景模拟：现在MissLi将HelloWord.txt做了修改，要push到远程库，因为没有加入到团队，无法push
>
> 注意：这里是在两个不同的账号下分别push，第quit一次从本地库推送到远程可是A的账户，B从A的远程账户下克隆出来项目，进而修改，修改之后推送到A的远程库的时候，由于A没有给B权限，（也就是不在同一个团队），因此本该无法push，会有一个登陆GitHub的过程。
>
> ![在这里插入图片描述](Git笔记version1.assets/20200302213232406.png)
>
> 但是我这儿，直接pushOK了。没有出现登陆，说明第二次Push，也就是B在Push的时候，用的是A的账户，导致GitHub认为，A自己从本地库推送项目到远程库，又从远程库克隆项目到本地。修改完成后又推送，这一系列过程都是A所为，因为推送的时候没有出现换账户的窗口，但是还推送成功。说明，有可能就是缓存等等……
>
> 查阅资料发现：
>
> ![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738430.png)
>
> > 在这个页面你将会看到之前保存过的Git用户账号，在普通凭据标签下面，
> >
> > 以“git”开头的就是你git各个git远程仓库地址。选择你想要修改远程仓库的对应的条目，就可以在展开的页面进行修改和删除了。
>
> 这里确实有一个git开头的链接，用户和密码都是我第一次Push的时候登录的账号和密码。删除后，再次push就出现了登录提示，当然了push是false，因为B此时还没有权限

**A邀请B加入团队**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738531.png)

------

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738532.png)

**B接受邀请后**

> 重新push
>
> ![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738533.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738534.png)

### 4.2.8、远程库拉取操作

> A拉取下来的文件，他是远程库修改后的文件，但是并没有修改A的文件
>
> ```shell
> #git fetch [别名 分支]
> git fetch hello master
> 12
> ```

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738535.png)

> 发现并没有改变本地库内容，这时候需要切换到远程库分支
> 想要查看拉去下来的文件，需要先切换分支
>
> ![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738636.png)

**好处：确认没有问题再合并**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738637.png)

> - pull操作相当于fetch+merge
> - git fetch [远程库别名]+[远程库分支名]
> - git merge [远程库别名/远程库分支名 ]
>
> ```shell
> #不管会不会冲突，先合并再说
> git pull hello master
> ```

### 4.2.9、团队协作冲突

> 修改同一个文件的同一个位置
>
> A用户，在本地某一文件、某一位置修改了文件，并且优先于B用户推送到远程库。
>
> 此时B在不知情的情况下，也在同个文件、同个位置做了修改，也来推送到远程库

![在这里插入图片描述](Git笔记version1.assets/20200302213507133.png)此时应该：

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738638.png)

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738639.png)

### 4.2.10、跨团队协作

> 情景：A公司的项目经理和B公司的项目经理一起完成一个工程。A经理创建了一个准备环境

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738740.png)

> B经理现在访问A经理所创建的远程库，并Fork一份到自己的远程库

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738741.png)

> B经理克隆到自己的本地库

![在这里插入图片描述](Git笔记version1.assets/2020030221361439.png)

> 现在B经理对"环境"项目做了自己的事

![在这里插入图片描述](Git笔记version1.assets/20200302213644884.png)

> 确定无误后，需要向A经理，发起请求合并

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738742.png)

> 

![在这里插入图片描述](Git笔记version1.assets/20200302213709984.png)

> 

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738843.png)

> 

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738844.png)

> B 经理结束
>
> A经理开始处理

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738845.png)

> 

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738846.png)

> **审核代码：**

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738947.png)

> 当觉得没有问题的时候，就可以合并了

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738948.png)

> 

![在这里插入图片描述](Git笔记version1.assets/20200302213844545.png)

> 最后将远程库修改拉取到本地库

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823738949.png)

### 4.2.11、SSH免密登陆

> - 进入家目录
>
> ```shell
> $ cd ~
> 
> ```
>
> - 删除.ssh文件
>
> ```shell
> $ rm -r .ssh/
> 
> ```
>
> - 运行命令生成.ssh密匙目录
>
> ```shell
> $ ssh-keygen -t rsa -C 1260811995@qq.com
> 
> ```
>
> - 进入到.ssh目录查看文件列表
>
> ```shell
> cd .ssh
> ll
> 
> ```
>
> - 查看id_rsa.pub文件内容
>
> ```shell
> $ cat id_rsa.pub
> 
> ```
>
> - 复制内容，黏贴在Settings----->SSH and GPG keys
> - New SSH Key
> - 输入复制的密匙信息

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823739050.png)

> 

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823739151.png)

> 

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823739152.png)

> 

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823739153.png)

> 

**测试免密：**

首先将修改的文件提交到本地仓库，这样就只剩下push到远程仓库。

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823739154.png)

### 4.2.12、删除本地库

#### 4.2.12.1、取消本地目录下关联的远程库

![在这里插入图片描述](Git笔记version1.assets/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzE5ODM1MjQ3,size_16,color_FFFFFF,t_70-166865823739255.png)

#### 4.2.12.2、删除.get文件

```shell
rm -rf .git
1
```

#### 4.2.12.3、删除文件夹

![在这里插入图片描述](Git笔记version1.assets/20200302214039168.png)
