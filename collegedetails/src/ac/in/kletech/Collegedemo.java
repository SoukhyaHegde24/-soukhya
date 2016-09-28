package ac.in.kletech;

public class Collegedemo {

	public static void main(String[] args) {
		
		College bvb=new College("BVB","KA_BVB");
		College vidya=new College("vidya","KA_VIDYA");
		
		bvb.addDepartment("cse", "cse_bvb", 450);
		bvb.addDepartment("ise", "ise_bvb", 400);
		bvb.addDepartment("ece", "ece_bvb", 500);
		
		vidya.addDepartment("maths", "mat_vidya", 150);
		vidya.addDepartment("phy","phy_vidya",100);
		vidya.addDepartment("bio","bio_vidya",100);
		
		System.out.println("bvb total students="+bvb.getCollegeStrength());
		System.out.println("vidya total students="+vidya.getCollegeStrength());

	}

}
