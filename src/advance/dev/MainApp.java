package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
				SinhVien arr[] = new SinhVien[10];
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap vao 10 nguoi");
				for (int i = 0; i < arr.length; i++) {
					System.out.println("Nhap vao nguoi thu :" +(i+1));
					String name = sc.nextLine();
					int old = sc.nextInt();
					sc.nextLine();
					String adress = sc.nextLine();
					int phone = sc.nextInt();
					sc.nextLine();
					float average = sc.nextInt();
					arr[i] = new SinhVien(name , old , adress, phone, average);
					sc.nextLine();
				}
				//in ra danh sach
			for (int i = 0; i < arr.length; i++) {
				System.out.format("Name:% - 01d: %d - Adress: %s - phone: %d - average: %2f",arr[i].name,arr[i].old,arr[i].adress,arr[i].phone,arr[i].average).println();
			}
				}
	}
				
	
			
			
			
				
		
			

	