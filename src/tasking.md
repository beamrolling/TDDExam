### 普通顾客存S号包  
**Given**  一个S号Locker，有剩余空间     
**When**  存S号包    
**Then** 包成功存入S号Locker中，返回票  
  
**Given**  一个S号Locker，无剩余空间     
**When**  存S号包    
**Then** 存包失败，显示柜已满    
  
***  
### 普通顾客存M号包  
**Given**  PrimaryLockerRobot管理2个M号Locker，均有剩余空间     
**When**  PrimaryLockerRobot存M号包    
**Then** 包成功存入第1个M号Locker中，返回票  

**Given**  PrimaryLockerRobot管理2个M号Locker，第1个Locker已满，第2个还有剩余空间    
**When**  PrimaryLockerRobot存M号包    
**Then** 包成功存入第2个M号Locker中，返回票      
  
**Given**  PrimaryLockerRobot管理2个M号Locker，均无剩余空间     
**When**  PrimaryLockerRobot存M号包    
**Then** 存包失败，显示柜已满   
  
***  
### 普通顾客存L号包  
**Given**  SuperLockerRobot管理2个L号Locker，第1个可用容量为5，容量为5，第2个可用容量为4，容量为5     
**When**  SuperLockerRobot存L号包    
**Then** 包成功存入第1个L号Locker中，返回票  

**Given**  SuperLockerRobot管理2个L号Locker，第1个可用容量为3，容量为5，第2个可用容量为4，容量为5     
**When**  SuperLockerRobot存L号包    
**Then** 包成功存入第2个L号Locker中，返回票  

**Given**  SuperLockerRobot管理2个L号Locker，第1个可用容量为4，容量为5，第2个可用容量为4，容量为5     
**When**  SuperLockerRobot存L号包    
**Then** 包成功存入第1个L号Locker中，返回票      
  
**Given**  SuperLockerRobot管理2个L号Locker，均无剩余空间     
**When**  SuperLockerRobot存L号包    
**Then** 存包失败，显示柜已满  
  
***  
### 普通顾客取S号包  
**Given**  一张有效S号Locker的票     
**When**  S号Locker取包    
**Then**  取包成功  
   
**Given**  一张无效票     
**When**  S号Locker取包    
**Then**  取包失败，提示无效票据  
   
**Given**  一张重复使用的S号Locker的票     
**When**  S号Locker取包    
**Then**  取包失败，提示无效票据  
   
**Given**  一张M号Locker的票     
**When**  S号Locker取包    
**Then**  取包失败，提示票据不符  
   
***  
### 普通顾客取M号包  
**Given**  一张有效M号Locker的票     
**When**  PrimaryLockerRobot取包    
**Then**  取包成功   
  
**Given**  一张无效票     
**When**  PrimaryLockerRobot取包    
**Then**  取包失败，提示无效票据  
   
**Given**  一张重复使用的M号Locker的票     
**When**  PrimaryLockerRobot取包    
**Then**  取包失败，提示无效票据  

**Given**  一张L号Locker的票     
**When**  PrimaryLockerRobot取包    
**Then**  取包失败，提示票据不符  

***  
### 普通顾客取L号包  
**Given**  一张有效L号Locker的票     
**When**  SuperLockerRobot取包    
**Then**  取包成功   
  
**Given**  一张无效票     
**When**  SuperLockerRobot取包    
**Then**  取包失败，提示无效票据  
   
**Given**  一张重复使用的L号Locker的票     
**When**  SuperLockerRobot取包    
**Then**  取包失败，提示无效票据  

**Given**  一张S号Locker的票     
**When**  SuperLockerRobot取包    
**Then**  取包失败，提示票据不符  

***
### LockerRobotManager存取包  
**Given**  LockerRobotManager管理1个S号Locker；1个PrimaryLockerRobot，管理1个M号Locker；1个SuperLockerRobot，管理1个L号Locker。且S号Locker有剩余空间     
**When**  LockerRobotManager存S号包    
**Then** 包成功存入S号Locker中，返回票  
  
**Given**  LockerRobotManager管理1个S号Locker；1个PrimaryLockerRobot，管理1个M号Locker；1个SuperLockerRobot，管理1个L号Locker。且S号Locker无剩余空间     
**When**  LockerRobotManager存S号包    
**Then** 存包失败，显示柜已满  

**Given**  LockerRobotManager管理1个S号Locker；1个PrimaryLockerRobot，管理1个M号Locker；1个SuperLockerRobot，管理1个L号Locker。且M号Locker有剩余空间     
**When**  LockerRobotManager存M号包    
**Then** 包成功存入M号Locker中，返回票 

**Given**  LockerRobotManager管理1个S号Locker；1个PrimaryLockerRobot，管理1个M号Locker；1个SuperLockerRobot，管理1个L号Locker。且M号Locker无剩余空间     
**When**  LockerRobotManager存M号包    
**Then** 存包失败，显示柜已满  

**Given**  LockerRobotManager管理1个S号Locker；1个PrimaryLockerRobot，管理1个M号Locker；1个SuperLockerRobot，管理1个L号Locker。且L号Locker有剩余空间     
**When**  LockerRobotManager存L号包    
**Then** 包成功存入L号Locker中，返回票  

**Given**  LockerRobotManager管理1个S号Locker；1个PrimaryLockerRobot，管理1个M号Locker；1个SuperLockerRobot，管理1个L号Locker。且L号Locker无剩余空间     
**When**  LockerRobotManager存L号包    
**Then** 存包失败，显示柜已满 

**Given**  一张有效的票     
**When**  LockerRobotManager取包    
**Then**  取包成功  
   
**Given**  一张无效票     
**When**  LockerRobotManager取包    
**Then**  取包失败，提示无效票据