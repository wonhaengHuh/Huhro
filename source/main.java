
public class Homework1 {
	
	public static void main(String[] args){
	
	String A="밖으로 나간다음 문을 잠급니다";
	String B="다시";
	
	//조건문
	boolean elevator = false;
	
	boolean soongsilhaeng = false;

	//남성역에서 군자역까지 순서대로 역이름
	String[] station ={"이수", "내방", "고속터미널", "반포", "논현", "학동",
			"압구정 로데오", "청담", "뚝섬 유원지", "건대입구", "어린이 대공원", "군자"};
	
	String[] exit = {"1번 출구", "2번 출구", "3번 출구", "4번 출구", "5번 출구", "6번 출구"};
	
	
	
	
    
    int escalator = 1; //
	int seatNum = 4;  // 지하철 좌석 수
	int aa=0;// station[] 안에 넣을 변수
	
	int money = 20000; // 카드에 있는 돈
	int waitingTime = 8; //x는 지하철 대기시간
	
	
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
	}
	
	
	if(soongsilhaeng){
		System.out.println("선생님이랑 같이 지하철을 타러간다");
	}
	else{ 
		System.out.println("혼자 간다.");
	}
	
    if (escalator==1){
    	System.out.println("에스컬레이터를 타고 내려간다.");
    }
	else {
		System.out.println("계단을 걸어 내려간다");
	}
	while(waitingTime>0){
	
	if (waitingTime<2){System.out.println("서서 기다린다");
	}
	else {System.out.println("앉아서 기다린다");
	}
	waitingTime=waitingTime-1; // 1분마다 1씩줄어든다
	System.out.println("1분이 지났다");
	}
	System.out.println("지하철이 왔다");
	System.out.println("바로 탄다");
	
	
	if (seatNum >=1){
		System.out.println("앉아서 간다");
	}else {
		System.out.println("일어서서 간다"); 
	
	
	}
	while(aa<12) {
		if(aa==11){System.out.println(station[aa]+"역입니다.");
		System.out.println("환승을 할 수 있는 역입니다.");
		System.out.println("내린다.");
		}
		else if(aa==10){
			System.out.println(station[aa]+"역입니다.");
			System.out.println("일어선다");
			
		}
		else if(aa==0 ||aa==2 ||aa==6 ||aa==9){
		System.out.println(station[aa]+"역 입니다.");
		System.out.println("환승을 할 수 있는 역입니다.");
		System.out.println("내리지 않고 앉아있는다.");
		}
		
		
		else{
		System.out.println(station[aa]+"역 입니다.");
		System.out.println("내리지 않고 앉아있는다.");
			
		}
		aa=aa+1;
		
		}
        if (escalator==0){System.out.println("에스컬레이터를 타고 올라간다.");
	
	    }
	    
        else {System.out.println("계단을 걸어 올라간다");
	    }
        
        System.out.println("카드를 찍는다");
        if(money<100){System.out.println("잔액이 부족합니다.");
        }
        else{ System.out.println("삑 지나간다.");
        }
        if (escalator==1){System.out.println("에스컬레이터를 타고 올라간다.");
    	
    	}
    	else {System.out.println("계단을 걸어 올라간다");

	}
    

}
}

	
