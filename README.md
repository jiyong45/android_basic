# android_basic
안드로이드 하면서 기본개념 배우는것들 정리겸 해보려고 만든것..


kotlin 문법 연습용으로 println 사용하면서 바로바로 결과 확인하고 싶은 경우 file > new > scratch file 에서 kotlin 으로 작성하면 


1.Kotlin 에서의 val 과 var 의 차이점

val  : 값을 설정을 하게되면 변수를 변경이 불가능하고 읽기만 가능한 변수 불변의 값(Value)이라서 val 약자

var : 가변 변수, 값의 읽기와 쓰기가 모두 허용되는것...




2. 변수 선언할때에 by lazy , lateinit 의 차이점

lateinit의 경우에는 계속하여 값이 변경될 수 있다는 속성을 위해 "무조건" var 을 사용하여야 되고 
primitive Type (int,float,double,long) 에는 사용이 불가능하다.

### 근데 여기에서 늦은 초기화의 개념은 어떻게 확인 할 수 있는거지...?? 이건 물어보기로
## lateinit 변수 선언을 val 로 하려고하면 빨간줄이 뜸 ... 근데 여기서 무시하고 실행시키면
#### 'lateinit' modifier is allowed only on mutable properties   << 메세지가 나옴

by lazy 의 경우 선언 당시 초기화 방법이 없는데 다른애들한테서 '호출' 될때에 이를 어떻게 초기화 할지 정의 가능함... 

간단하게 이해해보기 

### 값 변경 가능? 
  lateinit : 쌉가능 (var 사용)
  by lazy : ㄴㄴ 불가능 (val 사용)
  
###  용법 구분
  lateinit : 초기화 이후에 계속 값이 바뀔 수 있을 때 사용
  by lazy : 초기화 이후에 읽기 전용 값으로 사용할 때 사용
  
  
  
  
3. 생명주기 확인하기  
## 생명주기 참조 url 
https://brunch.co.kr/@mystoryg/80
//이건 조금더 봐야 뭐 알거같다... 아직 한참남은거같음...


