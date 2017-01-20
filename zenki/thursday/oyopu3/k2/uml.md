# UML (Unified Modeling Language)
* プログラムを、色々な視点から視覚化する言語・方法


## UMLでできること
* 以下の要素を図で表現する
    - システムの動く
    - クラス、オブジェクトの構造
    - メソッド呼び出しの流れ


## sample code
```java
class Sample01{
  public int age;
  protected String name;
  private double height;
  int weight;
  static int count;

  public void setName(String name){
    this.name = name;
  }
  public void hello(){
  }
  private static int getCount(){
    return count;
  }
}
```


## sample uml
* class
    - abstract : いたりっく

* field
    - public : +
    - protected : #
    - private : -
    - (none) : ~
    - static : 下線

* method
    - (引数の型)
`
+-------------------------------------+
|              Sample01               |
+-------------------------------------+
|+ age: int                           |
|# name: String                       |
|- height: double                     |
|~ weight: int                        |
|~ count: int                         |
|  ~~~~~                              |
+-------------------------------------+
|+ setName(java.lang.String): void    |
|- hello(): void                      |
|+ getCount(): int                    |
|  ~~~~~~~~~~                         |
+-------------------------------------+
`


## 継承 extends
* uml(sub) ------> uml(super)
* 先っちょ白△ 


## インターフェース interface
* classの所
* いたりっくらす
`
+---------------+
| <<interface>> |
|   className   |
+---------------+
|               |
`
* uml(sub) - - - > uml(super)
* 先っちょ白△ 


## 集約 aggregation
* uml(aggregation) ◇ -----|> uml(content)
* 先っちょ白△ 
* 重度とかある


## 他
*             Uses >
* uml(class) ------→  uml(class)
* 上黒▲ 
* 他
    - Creates
    - register
    - とか　それっぽいやつ


## シーケンス図
* プリント
