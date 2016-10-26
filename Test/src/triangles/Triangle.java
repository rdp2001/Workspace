package triangles;

public class Triangle {

		private double sideA;
		private double sideB;
		private double sideC;
		public Triangle(double a, double b, double c) {
			sideA=a;
			sideB=b;
			sideC=c;
		}
		public double perimeter(){
			return sideA+sideB+sideC;
		}
		public double area(){
			double s=(sideA+sideB+sideC)/2;
			return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
		}
		public String typeName(){
			if(sideA==sideB&&sideB==sideC) {
				return "Equilateral";
			}else if(sideA==sideB||sideA==sideC||sideB==sideC){
				return "Isoceles";
			}else{
				return "Scalene";
			}
		}
		public boolean isRight() {
			if(sideA*sideA+sideB*sideB==sideC*sideC||sideC*sideC+sideB*sideB==sideA*sideA||sideA*sideA+sideC*sideC==sideB*sideB){
				return true;
			}else{
				return false;
			}
		}
}
