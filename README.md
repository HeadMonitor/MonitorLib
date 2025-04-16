![MonitorLib](media/MonitorLib.png)

<!--suppress ALL -->
<div align="center">
    A Minecraft Plugin Library to make your life developing, easier.
</div>

<br/>

<div align="center">
  <a href="https://github.com/HeadMonitor/MonitorLib"><img src="media/GitHubLogo.png" alt="mobCreatorGUI" width="64" /></a>
  <a href=""><img src="media/SpigotLogo.png" alt="mobCreatorGUI" width="64" /></a>
  <a href=""><img src="media/HangarLogo.png" alt="mobCreatorGUI" width="64" /></a>
  <a href=""><img src="media/BuiltByBitLogo.png" alt="mobCreatorGUI" width="64" /></a>
  <a href=""><img src="media/PolymartLogo.png" alt="mobCreatorGUI" width="64" /></a>
</div>

<br/>

<div align="center">
  <img src="media/Features.png" alt="features" height="60"/>
</div>

- Item, Skull and Entity Creators.
- Material, Enchantment, Potion Utilities.
- Adventure Component and Readability Utilities.

<br/>

<div align="center">
  <img src="media/HowToUse.png" alt="howToUse" height="60"/>
</div>

You can find the Wiki for the Library [here](https://github.com/HeadMonitor/MonitorLib/wiki) and the JavaDoc [here](https://headmonitor.github.io/MonitorLib/)!
 
## Maven Setup
```xml
<!-- If you are using Paper -->
<dependency>
    <groupId>net.headmonitor</groupId>
    <artifactId>MonitorLibPaper</artifactId>
    <version>1.0.0.0</version>
</dependency>

<!-- If you are using Spigot -->
<dependency>
    <groupId>net.headmonitor</groupId>
    <artifactId>MonitorLibSpigot</artifactId>
    <version>1.0.0.0</version>
</dependency>
```
![](https://img.shields.io/github/v/tag/HeadMonitor/MonitorLib?label=Latest%20Version&style=flat-square)

You will also need to shade the Library into your .jar file.

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-shade-plugin</artifactId>
    <version>3.4.1</version> <!-- latest as of now -->
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>shade</goal>
            </goals>
            <configuration>
                <relocations>
                    <relocation>
                        <pattern>net.headmonitor</pattern>
                        <shadedPattern>your.plugin.libs.headmonitor</shadedPattern>
                    </relocation>
                </relocations>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## Manual Setup
If you want to use the Library witout **Build Automation Tools** you can download the **.jar** and add it
as a dependency in your IDE. Make sure you extract it in your .jar file.

<br/>

<div align="center">
  <img src="media/Support.png" alt="support" height="60" />
</div>

You can get **Support**, **Request a Feature** or **Report a Bug** through a [GitHub Issue](https://github.com/HeadMonitor/MonitorLib/issues) 
or through my [Discord](https://discord.gg/GcmTStpyYr). I will my our best to help you out!
