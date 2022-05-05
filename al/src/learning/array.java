package learning;

public class array {
    public static void main(String[] args) {
		String[] beer = {"Kloud", "Cass", "Asahi", "Guinness", "Heineken"};
		    // 인덱스 번호 :   0  ,    1   ,   2   ,     3      ,     4
		System.out.println(beer[0]); // Kloud
		System.out.println(beer[1]); // Cass
		System.out.println(beer[2]); // Asahi
		System.out.println(beer[3]); // Guinness
		System.out.println(beer[4]); // Heineken

        int[] score = { 93, 75, 95, 76, 70 };
		int sum = 0;
		for (int i = 0; i < score.length; i++) { // score.length = 5
			sum += score[i]; // sum = sum + score[i];
		}
		double avg = (double) sum / score.length; // 형변환
		System.out.println("점수 합계 : " + sum); // 결과 : 409
		System.out.println("점수 평균 : " + avg); // 결과 : 81.8

        /**
         * ArrayList 와 Array 의 차이점 
         * list 의 인터페이스를 상속받은 ArrayList
         * 배열과의 큰 차이점은 배열은 크기가 고정인 반면
         * arrayList는 가변적이다.
         * 
         * ArrayList 
         * 
         *  ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 타입 지정
            ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략 가능
            ArrayList<Integer> integers3 = new ArrayList<>(10); // 초기 용량(Capacity) 설정
            ArrayList<Integer> integers4 = new ArrayList<>(integers1); // 다른 Collection값으로 초기화
            ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()
            
            add() 메소드로 추가 
            set() 메소드로 기존에 추가된 값 변경 가능
            remove() 삭제 
            contains()로 값존재 여부 확인 (true, false로 값)
            indexof()로 값존재 확인후 어느 위치에 있는지 확인 (값 없으면 -1 반환 )

         */

         
	}

    
}
