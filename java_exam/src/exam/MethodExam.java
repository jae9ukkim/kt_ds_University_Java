package exam;

public class MethodExam {

	public static void printSum(int number) {
		int sum = 0;
		for(int i=1; i <= number; i++) {
			sum+=i;
		}
	}
	
	public static void printPrime(int number) {
		boolean isPrime = false;
		for(int i=4; i < number; i++) {
			isPrime = false;
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					isPrime = true;
					break;
				}
			}
			if(!isPrime) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
		
	public static void printMax(int number1, int number2) {
		if(number1>number2) {
			System.out.println(number1);
		} else {
			System.out.println(number2);
		}
	}
	
	public static void printAge(int age) {
		if(age < 20) {
			System.out.println("미성년");
		} else {
			System.out.println("성인");		
		}
	}
	
	public static String getFizzBuzz(int number) {
		String str = "";
		if(number % 3 == 0) {
			str += "Fizz";
		}
		if(number % 5 == 0) {
			str += "Buzz";
		}
		if(str.equals("")) {
			str += number;
		}
		
		return str;
	}
	
	public static int[] getUniqueNumbers() {
		int[] uniqNum = new int[7];
		int count = 0;
		int randNum = 0;
		boolean isExist = false;
		
		while(count < uniqNum.length) {
			isExist = false;
			randNum = (int)(Math.random()*45 + 1);
			for(int i = 0; i < count; i++) {
				if(randNum == uniqNum[i]) {
					isExist = true;
					break;
				}
			}
			if(!isExist) {
				uniqNum[count++] = randNum;
			}
		}
		
		return uniqNum;
	}
	
	public static String getEvenOdd(int num1, int num2) {
		String evenOdd = "";
		int multiple = num1 * num2;
		
		if(multiple % 2 == 0) {
			evenOdd += "짝수";
		} else {
			evenOdd += "홀수";
		}
		
		return evenOdd;
//		if(multiple % 2 == 0) {
//			return "짝수";
//		} else {
//			return "홀수";
//		}
	}
	
	public static int getSumOfFive(int num1, int num2, int num3, int num4, int num5) {
		int sum = num1 + num2+  num3 + num4+  num5;
		return sum;
	}
	
	public static double getAverage(int sum, int subjCnt) {
		double average = (double)sum / subjCnt;
		average = Math.round(average * 100) / (double)100;
		return average;
	}
	
	public static String getGrade(int score) {
//		String grade = "";
//		
//		if(score>=95) {
//			grade += "A";
//		} else if(score>=85) {
//			grade += "B";
//		} else if(score>=75) {
//			grade += "C";
//		} else if(score>=65) {
//			grade += "D";
//		} else {
//			grade += "F";
//		} 
//		return grade;
		
		if(score>=95) {
			return "A";
		} else if(score>=85) {
			return "B";
		} else if(score>=75) {
			return "C";
		} else if(score>=65) {
			return "D";
		}
		return "F";
		 
	}
	
	public static String nextChar(char ch) {
		return (char)(ch + 1) + "";
	}
	
	public static String getCharacters(char ch1, char ch2) {
		String characters = "";
		for(int i = ch1; i <= ch2; i++) {
			characters += (char)i; 
		}
		
		return characters;
	}
	
	public static char getLowerCaseAlpha(char ch, int num) {
		char expChar = 0;
		if(num > 25 || num < 0) {
			return expChar;
		} else {
			expChar = (char)(ch + num);
			return expChar;
		}
			
	}
	
	public static char convertUpperCase(char lower) {
		char upper = (char)(lower - 32);
		if(lower < 'a' || lower > 'z') {
			upper = 0;
		}
		return upper;
		
	}
	
	public static void main(String[] args){
//		1. 1 부터 파라미터로 전달된 숫자까지의 합을 구한다.
//		   - printSum(10) => 55
		printSum(10);

//		2. 4 부터 파라미터로 전달된 숫자 중 소수만 출력한다.
//		   - printPrime(20) => 5, 7, 11, 13, 17, 19
		printPrime(20);

//		3. 파라미터로 전달된 숫자 두 개 중 가장 큰 수 하나만 출력한다.
//		   - printMax(10, 20) => 20
		printMax(10, 20);

//		4. 파라미터로 전달된 나이가 성인인지 미성년인지 구분하여 출력한다.
//		   - printAge(20) => "성인"
//		   - printAge(15) => "미성년"
		printAge(20);
		printAge(15);
		
//		5. 랜덤한 숫자를 생성하고 아래 규칙에 따른 결과를 반환한다.   
//		- 3의 배수이면 "Fizz"    
//		- 5의 배수이면 "Buzz"    
//		- 3과 5의 공배수이면 "FizzBuzz"    
//		- 그 외의 숫자이면 숫자 자체를 문자로 변경하여 반환한다.    
//		- getFizzBuzz(9) => "Fizz"    
//		- getFizzBuzz(10) => "Buzz"    
//		- getFizzBuzz(15) => "FizzBuzz"    
//		- getFizzBuzz(7) => "7"
		getFizzBuzz(9);    
		getFizzBuzz(10);    
		getFizzBuzz(15);    
		getFizzBuzz(7);

//		6. 서로 다른 숫자 7개를 배열에 할당하여 반환한다.
//		- getUniqueNumbers() => [3, 7, 11, 23, 29, 35, 42] (숫자는 예시일 뿐이며, 실행할 때마다 달라짐)
//		- 단, 배열에 할당된 숫자는 중복되지 않아야 한다.
		getUniqueNumbers();
		

//		7. 정수 파라미터 두 개를 전달받아 곱한 결과가 짝수인지 홀수인지 반환한다.
//		- getEvenOdd(4, 5) => "짝수"
//		- getEvenOdd(3, 5) => "홀수"
		getEvenOdd(4, 5);
		getEvenOdd(3, 5);

//		8. 전달된 정수 파라미터 5개의 합을 구해 반환한다.
//		- getSumOfFive(1, 2, 3, 4, 5) => 15
		getSumOfFive(1, 2, 3, 4, 5);

//		9. 합과 점수의 개수를 전달하여 평균을 구해 반환한다. (소수점 둘째 자리까지)
//		- getAverage(150, 3) => 50.00
		getAverage(150, 3);
//		getAverage(110, 3);

//		10. 평균 점수를 파라미터로 전달하여 학점을 반환한다.
//		- getGrade(95) => "A"
//		- getGrade(85) => "B"
//		- getGrade(75) => "C"
//		- getGrade(65) => "D"
//		- getGrade(55) => "F"
		getGrade(95); 
		getGrade(85); 
		getGrade(75); 
		getGrade(65); 
		getGrade(55); 
		
//		11. char 타입의 파라미터 하나를 받아 그 다음의 글자를 문자열로 반환한다.
//		- nextChar('a') => "b"
//		- nextChar('c') => "d"
//		- char 타입은 문자이면서 숫자입니다. 'a'에 1을 더하면 'b'가 됩니다.
//		- char 타입의 변수를 String으로 변환하려면 다음과 같은 식을 작성합니다.
//		- ((char) 'a' + 1) + "" => 'b'
		nextChar('a');
		nextChar('b');

//		12. char 타입의 파라미터 두 개를 받아 문자 사이에 있는 모든 글자를 문자열로 반환한다.
//		- getCharacters('a', 'z') => "abcdefghijklmnopqrstuvwxyz"
//		- getCharacters('A', 'Z') => "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//		- getCharacters('가', '나') => "가각갂갃간갅갆갇갈갉갊갋갌갍갎갏감갑값갓갔강갖갗갘같갚갛개객갞갟갠갡갢갣갤갥갦갧갨갩갪갫갬갭갮갯갰갱갲갳갴갵갶갷갸갹갺갻갼갽갾갿걀걁걂걃걄걅걆걇걈걉걊걋걌걍걎걏걐걑걒걓걔걕걖걗걘걙걚걛걜걝걞걟걠걡걢걣걤걥걦걧걨걩걪걫걬걭걮걯거걱걲걳건걵걶걷걸걹걺걻걼걽걾걿검겁겂것겄겅겆겇겈겉겊겋게겍겎겏겐겑겒겓겔겕겖겗겘겙겚겛겜겝겞겟겠겡겢겣겤겥겦겧겨격겪겫견겭겮겯결겱겲겳겴겵겶겷겸겹겺겻겼경겾겿곀곁곂곃계곅곆곇곈곉곊곋곌곍곎곏곐곑곒곓곔곕곖곗곘곙곚곛곜곝곞곟고곡곢곣곤곥곦곧골곩곪곫곬곭곮곯곰곱곲곳곴공곶곷곸곹곺곻과곽곾곿관괁괂괃괄괅괆괇괈괉괊괋괌괍괎괏괐광괒괓괔괕괖괗괘괙괚괛괜괝괞괟괠괡괢괣괤괥괦괧괨괩괪괫괬괭괮괯괰괱괲괳괴괵괶괷괸괹괺괻괼괽괾괿굀굁굂굃굄굅굆굇굈굉굊굋굌굍굎굏교굑굒굓굔굕굖굗굘굙굚굛굜굝굞굟굠굡굢굣굤굥굦굧굨굩굪굫구국굮굯군굱굲굳굴굵굶굷굸굹굺굻굼굽굾굿궀궁궂궃궄궅궆궇궈궉궊궋권궍궎궏궐궑궒궓궔궕궖궗궘궙궚궛궜궝궞궟궠궡궢궣궤궥궦궧궨궩궪궫궬궭궮궯궰궱궲궳궴궵궶궷궸궹궺궻궼궽궾궿귀귁귂귃귄귅귆귇귈귉귊귋귌귍귎귏귐귑귒귓귔귕귖귗귘귙귚귛규귝귞귟균귡귢귣귤귥귦귧귨귩귪귫귬귭귮귯귰귱귲귳귴귵귶귷그극귺귻근귽귾귿글긁긂긃긄긅긆긇금급긊긋긌긍긎긏긐긑긒긓긔긕긖긗긘긙긚긛긜긝긞긟긠긡긢긣긤긥긦긧긨긩긪긫긬긭긮긯기긱긲긳긴긵긶긷길긹긺긻긼긽긾긿김깁깂깃깄깅깆깇깈깉깊깋까깍깎깏깐깑깒깓깔깕깖깗깘깙깚깛깜깝깞깟깠깡깢깣깤깥깦깧깨깩깪깫깬깭깮깯깰깱깲깳깴깵깶깷깸깹깺깻깼깽깾깿꺀꺁꺂꺃꺄꺅꺆꺇꺈꺉꺊꺋꺌꺍꺎꺏꺐꺑꺒꺓꺔꺕꺖꺗꺘꺙꺚꺛꺜꺝꺞꺟꺠꺡꺢꺣꺤꺥꺦꺧꺨꺩꺪꺫꺬꺭꺮꺯꺰꺱꺲꺳꺴꺵꺶꺷꺸꺹꺺꺻꺼꺽꺾꺿껀껁껂껃껄껅껆껇껈껉껊껋껌껍껎껏껐껑껒껓껔껕껖껗께껙껚껛껜껝껞껟껠껡껢껣껤껥껦껧껨껩껪껫껬껭껮껯껰껱껲껳껴껵껶껷껸껹껺껻껼껽껾껿꼀꼁꼂꼃꼄꼅꼆꼇꼈꼉꼊꼋꼌꼍꼎꼏꼐꼑꼒꼓꼔꼕꼖꼗꼘꼙꼚꼛꼜꼝꼞꼟꼠꼡꼢꼣꼤꼥꼦꼧꼨꼩꼪꼫꼬꼭꼮꼯꼰꼱꼲꼳꼴꼵꼶꼷꼸꼹꼺꼻꼼꼽꼾꼿꽀꽁꽂꽃꽄꽅꽆꽇꽈꽉꽊꽋꽌꽍꽎꽏꽐꽑꽒꽓꽔꽕꽖꽗꽘꽙꽚꽛꽜꽝꽞꽟꽠꽡꽢꽣꽤꽥꽦꽧꽨꽩꽪꽫꽬꽭꽮꽯꽰꽱꽲꽳꽴꽵꽶꽷꽸꽹꽺꽻꽼꽽꽾꽿꾀꾁꾂꾃꾄꾅꾆꾇꾈꾉꾊꾋꾌꾍꾎꾏꾐꾑꾒꾓꾔꾕꾖꾗꾘꾙꾚꾛꾜꾝꾞꾟꾠꾡꾢꾣꾤꾥꾦꾧꾨꾩꾪꾫꾬꾭꾮꾯꾰꾱꾲꾳꾴꾵꾶꾷꾸꾹꾺꾻꾼꾽꾾꾿꿀꿁꿂꿃꿄꿅꿆꿇꿈꿉꿊꿋꿌꿍꿎꿏꿐꿑꿒꿓꿔꿕꿖꿗꿘꿙꿚꿛꿜꿝꿞꿟꿠꿡꿢꿣꿤꿥꿦꿧꿨꿩꿪꿫꿬꿭꿮꿯꿰꿱꿲꿳꿴꿵꿶꿷꿸꿹꿺꿻꿼꿽꿾꿿뀀뀁뀂뀃뀄뀅뀆뀇뀈뀉뀊뀋뀌뀍뀎뀏뀐뀑뀒뀓뀔뀕뀖뀗뀘뀙뀚뀛뀜뀝뀞뀟뀠뀡뀢뀣뀤뀥뀦뀧뀨뀩뀪뀫뀬뀭뀮뀯뀰뀱뀲뀳뀴뀵뀶뀷뀸뀹뀺뀻뀼뀽뀾뀿끀끁끂끃끄끅끆끇끈끉끊끋끌끍끎끏끐끑끒끓끔끕끖끗끘끙끚끛끜끝끞끟끠끡끢끣끤끥끦끧끨끩끪끫끬끭끮끯끰끱끲끳끴끵끶끷끸끹끺끻끼끽끾끿낀낁낂낃낄낅낆낇낈낉낊낋낌낍낎낏낐낑낒낓낔낕낖낗나"
//		- char 타입은 문자이면서 숫자입니다.
		getCharacters('a', 'z');
		getCharacters('A', 'Z');
		getCharacters('가', '나');
		
		
//		13. 영소문자는 26개로 구성됨. 'a'에 25를 더하면 'z'. char와 int 파라미터를 전달했을 때 예상되는 문자를 반환.
//		- getLowerCaseAlpha('a', 25) => 'z'
//		- getLowerCaseAlpha('a', 1) => 'b'
//		- getLowerCaseAlpha('a', 0) => 'a'
//		- 0보다 작고 25보다 큰 숫자를 전달할 경우 '' 가 반환되도록 합니다.
//		- getLowerCaseAlpha('a', -1) => ''
//		- getLowerCaseAlpha('a', 26) => ''
		getLowerCaseAlpha('a', 25);
		getLowerCaseAlpha('a', 1);
		getLowerCaseAlpha('a', 0);
		getLowerCaseAlpha('a', -1);
		getLowerCaseAlpha('a', 26);

//		14. 영 소문자 글자 하나를 파라미터로 전달하면 대문자로 변환하여 반환.
//		- convertUpperCase('a') => 'A'
//		- convertUpperCase('c') => 'C'
//		- 소문자에서 32를 빼면 대문자로 변환됩니다.
//		- 전달된 문자가 'a'와 'z' 사이의 문자가 아니라면 '' 를 반환.
//		- convertUpperCase('1') => ''
//		- convertUpperCase('A') => ''
//		- convertUpperCase('^') => ''
		convertUpperCase('a');
		convertUpperCase('c');
		convertUpperCase('1');
		convertUpperCase('A');
		convertUpperCase('^');
		
	}
}
