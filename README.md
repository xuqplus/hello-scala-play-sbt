#### intellij idea development environment setup on windows 10
##### jdk
install 1.8 or higher & set $JAVA_HOME & add $JAVA_HOME/bin to PATH
##### scala  
install version 2.13.4 & set $SCALA_HOME & add $SCALA_HOME/bin to PATH
##### sbt (Simple Build Tool)
install version 1.4.5  
&  
idea settings => build tools => sbt => custom => choose $SBT_HOME/bin/sbt-launch.jar  
&  
check 'Enable debugging'

#### new
`sbt new playframework/play-scala-seed.g8`

#### run
click sbt toolbar => current project => sbt commands => run the '<' and it'll jump to a 'sbt shell' toolbar  
&  
in sbt shell type 'run' + 'Enter'

#### debug
click the green debugger button in 'sbt shell' window

#### references
https://www.playframework.com/  
https://www.scala-sbt.org/  
