package squares;

public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[]={0.0,0.2,0.4,0.6,0.8,1.0,1.2};
		double y[]={2.0,2.8,3.3,5.6,7.8,8.8,9.7};
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x,y);
		for(int i = 0; i < 100; i++){
			 theta = slib.getDx();
			 System.out.println(i+" : theta[0] = "+theta[0]);
			 System.out.println(i+" : theta[1] = "+theta[1]);
	         System.out.println(i+" : Objective function = "+slib.getRx());
	}
	}
	}
//EXCELで求めた結果、グラフの傾き（theta[0])=7.0714,切片（theta[1]）＝1.4714であった。
