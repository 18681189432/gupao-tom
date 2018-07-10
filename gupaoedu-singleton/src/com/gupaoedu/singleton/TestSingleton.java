package com.gupaoedu.singleton;

/**
 * 单例模式：
 * 特点：
 * 1、保证从系统启动到系统终止，全过程只产生一个实力；
 * 2、当在应用中遇到功能性冲突性时，需要使用单例模式。
 * 使用场景：
 * 配置文件、直接上级领导
 * @author Administrator
 *
 */
public class TestSingleton {  
    String name = null;  
    private TestSingleton() {}  
  
    //注意这里用到了volatile关键字
    private static volatile TestSingleton instance = null;  
  
    public static TestSingleton getInstance() {  
       if (instance == null) {    
         synchronized (TestSingleton.class) {    
            if (instance == null) {    
               instance = new TestSingleton();   
            }    
         }    
       }   
       return instance;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public void printInfo() {  
        System.out.println("the name is " + name);  
    }  
  
}
