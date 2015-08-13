
public class Homework1 {
	
	public static void main(String[] args){ // 질문할거 이거 왜쓰는지  그리고 []이것도 왜쓰는지 배열이란걸 알리기 위해?
	
	String A="밖으로 나간다음 문을 잠급니다";
	String B="다시";
	String item = "";          //나중에 여기에 뭘 넣기위해 비워뒀다.
	
	//조건문
	boolean elevator = false;
	boolean buy = true;
	boolean soongsilhaeng = false;

	//남성역에서 군자역까지 순서대로 역이름
	String[] station ={"이수", "내방", "고속터미널", "반포", "논현", "학동",
			"압구정 로데오", "청담", "뚝섬 유원지", "건대입구", "어린이 대공원", "군자"};
	
	String[] exit = {"1번 출구", "2번 출구", "3번 출구", "4번 출구", "5번 출구", "6번 출구","7번 출구","8번 출구"};
	
	
    
    int password = 1234;           // 집 현관 비밀번호
    int homePassword= 4321;        // 집 비밀번호
    int escalator = 1;              // 에스컬레이터에 int 변수를 1이라 설정했다 if 조건문을 이용하기위해
	int seatNum = 4;                   // 지하철 좌석 수
	int aa=0;                        // station [] 안에 넣을 변수
	int bb=0;                      //exit[] 안에 넣을 변수
	int money = 20000;             // 카드에 있는 돈
	int waitingTime = 8;            //x는 지하철 대기시간
	
	
	System.out.println(A);
	System.out.println("물을 안가지고 나왔습니다.");
	System.out.println("문을 열고 들어 갑니다.");
	System.out.println(B+" "+A);
	
	
	if (elevator){
		System.out.println("엘레베이터를 타고 내려간다");

	}
	else {
		System.out.println("계단을 걸어 내려간다.");
	}
	
	if (escalator==1){
		System.out.println("에스컬레이터를 타고 내려간다.");
	}
	
	
	else {
		System.out.println("계단을 걸어 내려간다");
	}
	System.out.println("카드를 찍는다");
	
	if(money<1250){
		System.out.println("잔액이 부족합니다.");
	}
	else{
		System.out.println("삑 지나간다.");
		money=money-1250;
	}
	
	
	if(soongsilhaeng){
		System.out.println("선생님이랑 같이 지하철을 타러간다"); //만약 숭실행이라면 선생님이랑 같은방향으로 지하철을 타고간다.
	}
	else{ 
		System.out.println("혼자 간다.");     // 그게아니라면 혼자간다.
	}
	
    if (escalator==1){
    	System.out.println("에스컬레이터를 타고 내려간다."); // escalator가 있다면 에스컬레이터를 타고간다.
    }
	else {
		System.out.println("계단을 걸어 내려간다");  // 그게아니라면 걸어내려간다
	}
	while(waitingTime>0){             // 만약 지하철이 기다리는 시간이0분이 기다린다.
	
	if (waitingTime<2){System.out.println("서서 기다린다");  // 기다리는 시간이2분이하라면 서서기다린다.
	}
	else {System.out.println("앉아서 기다린다"); // 2분 이상이라면 앉아서 기다린다
	}
	waitingTime=waitingTime-1; // 1분마다 1씩줄어든다
	System.out.println("1분이 지났다");
	}
	System.out.println("지하철이 왔다");
	System.out.println("바로 탄다");
	
	
	if (seatNum >=1){                    //자리가 1개이상이라면 앉아서간다.
		System.out.println("앉아서 간다");
	}else {                              // 그게 아니라면 일어서서 간다.
		System.out.println("일어서서 간다"); 
	
	
	}
	while(aa<12) {
		if(aa==11){System.out.println(station[aa]+"역입니다.");    // station [11]=군자역인데 군자역 도착하면 발동한다
		System.out.println("환승을 할 수 있는 역입니다.");
		System.out.println("내린다.");
		}
		else if(aa==10){                                 // station [10]=전역인 어린이 대공원 역에서 일어난다
			System.out.println(station[aa]+"역입니다.");
			System.out.println("일어선다");
			
		}
		else if(aa==0 ||aa==2 ||aa==6 ||aa==9){              // 집 가는동안 환승역들을 구별했다.  
		System.out.println(station[aa]+"역 입니다.");
		System.out.println("환승을 할 수 있는 역입니다.");
		System.out.println("내리지 않고 앉아있는다.");
		}
		
		
		else{                                       //환승역도 아니고 도착역,전역도 아닌 나머지 역들일 경우 발동한다
		System.out.println(station[aa]+"역 입니다.");
		System.out.println("내리지 않고 앉아있는다.");
			
		}
		aa=aa+1;          // 순환문을 한번 반복 할떄마다 aa가 1씩 증가하는데 이 뜻은 지하철을 지났다는 뜻이다.
		
		}
        if (escalator==0){System.out.println("에스컬레이터를 타고 올라간다."); // 에스컬레이터가 있으면 에스컬레이터를 타고간다
	
	    }
	    
        else {System.out.println("계단을 걸어 올라간다");  
	    }
        
        System.out.println("카드를 찍는다");
        if(money<100){System.out.println("잔액이 부족합니다.");// 카드에 백원이상 없다면 "잔액이 부족합니다라 뜰것이다"
         
        }
        else{ System.out.println("삑 지나간다.");  //있다면 찍히고 지나간다음 100원이 차감될것이다.
        money=money-100;
        }
        

	  while(bb<6){if(bb==5){System.out.println(exit[bb]+" 는 집으로 가는 길이야.");
	break;
	}
	else{ System.out.println(exit[bb]+" 는 집으로 가는길이 아니야.");
        
	bb=bb+1;  //처음에 안되는 이유가 이걸 else 문안에 써서 인줄 몰라서 break 문을 썻음 
        
        }
	if (escalator==1){System.out.println("에스컬레이터를 타고 올라간다.");
	
	}
	else {System.out.println("계단을 걸어 올라간다");
	 
	}
	}

	  System.out.println("슈퍼앞 까지 지나간다");                       
	  if (buy){System.out.println("슈퍼에 들어간다");                //살것이 있다면 슈퍼에 들어간다
	     System.out.println("나의 카드에 "+money+"원만큼 남아 있습니다.");   //내 카드 잔고
	     if(money>=15000){                               //15000원이상이 있따면 이걸 다 살수 있다
	    	 item="콘푸라이트,우유,닭강정";
	     }   
	     else if (money>=5000){                     //5000원 이상이 있다면 닭강정을 살 수 있고
	    	 item="닭강정";
	     }     
	     else {                                     // 아무것도 없다면 못산다
	    	 item="";
	     }    
	     System.out.println(item+"을 구입 했다.");         // 결과
	 }   
	  else {System.out.println("들어가지 않고 지나간다");            //살것이 없었다면 안들어 갔엇다
	  }
	  
	  
	  System.out.println("집앞에 도착했다");
	  System.out.println("비밀 번호를 치자");
	  if (password==1234){
		  System.out.println("열린다");
	  }
	  else {
		  System.out.println("안 열린다");
	  }
	  
	  
	  if (elevator){
			System.out.println("엘레베이터를 타고 올라간다");

		}
		else {
			System.out.println("계단을 걸어 올라간다.");
		}
	
	  System.out.println("비밀번호를 치자");
	  if (homePassword==4321){
		  System.out.println("열린다");
	  }
	  else {
		  System.out.println("안 열린다");
	  }
	}
	}




