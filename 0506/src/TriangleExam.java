public class TriangleExam {

	public static void main(String[] args) {
		
		
		
		
		
		Triangle t= new Triangle(10.2,17.3);
		
		System.out.println(t.sjfql());
		
		t.change(7.5, 9.2);
		
		System.out.println(t.sjfql());
	}

	}

	class Triangle{
		double w;
		double h;
		
		public Triangle(double w,double h){
			this.w=w;
			this.h=h;
		}
		public void change(double w,double b){
			this.w=w;
			this.h=h;
		}
		public double sjfql(){
			
			return w*h;
		}
		
		
		
	}