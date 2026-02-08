package com.product;

import java.util.Arrays;
import java.util.List;

import com.product.controller.ProductController;
import com.product.entity.Products;

public class InventoryApp {

	public static void main(String[] args) {

		ProductController pc = new ProductController();

		Products p1 = new Products("Laptop", "Electronics", 65000, "2024-01-10", "2027-01-10", 36, 10);
		Products p2 = new Products("Mobile", "Electronics", 30000, "2024-02-15", "2026-02-15", 24, 20);
		Products p3 = new Products("Headphones", "Accessories", 2500, "2024-03-01", "2025-03-01", 12, 50);
		Products p4 = new Products("Keyboard", "Accessories", 1500, "2024-01-05", "2026-01-05", 12, 30);
		Products p5 = new Products("Mouse", "Accessories", 800, "2024-01-07", "2026-01-07", 12, 40);
		Products p6 = new Products("Monitor", "Electronics", 12000, "2023-12-10", "2026-12-10", 24, 15);
		Products p7 = new Products("Printer", "Electronics", 9000, "2023-11-20", "2026-11-20", 24, 8);
		Products p8 = new Products("Router", "Networking", 3500, "2024-02-01", "2026-02-01", 24, 25);
		Products p9 = new Products("Hard Disk", "Storage", 5500, "2024-03-10", "2027-03-10", 36, 18);
		Products p10 = new Products("Pen Drive", "Storage", 700, "2024-03-05", "2026-03-05", 24, 100);

		Products p11 = new Products("Smart Watch", "Wearable", 8000, "2024-01-25", "2026-01-25", 24, 12);
		Products p12 = new Products("Bluetooth Speaker", "Audio", 4500, "2024-02-18", "2026-02-18", 24, 22);
		Products p13 = new Products("Webcam", "Accessories", 3000, "2024-01-12", "2026-01-12", 24, 14);
		Products p14 = new Products("Power Bank", "Accessories", 2000, "2024-03-02", "2026-03-02", 24, 35);
		Products p15 = new Products("Tablet", "Electronics", 22000, "2024-01-30", "2027-01-30", 36, 9);
		Products p16 = new Products("AC", "Home Appliances", 42000, "2023-10-15", "2028-10-15", 60, 5);
		Products p17 = new Products("Refrigerator", "Home Appliances", 38000, "2023-09-10", "2028-09-10", 60, 6);
		Products p18 = new Products("Washing Machine", "Home Appliances", 29000, "2023-11-05", "2028-11-05", 60, 7);
		Products p19 = new Products("Microwave", "Home Appliances", 15000, "2024-01-08", "2027-01-08", 36, 10);
		Products p20 = new Products("Fan", "Home Appliances", 2500, "2024-02-12", "2029-02-12", 60, 20);

		Products p21 = new Products("UPS", "Electronics", 6500, "2024-01-05", "2026-01-05", 24, 10);
		Products p22 = new Products("External SSD", "Storage", 8500, "2024-02-10", "2027-02-10", 36, 12);
		Products p23 = new Products("Graphics Card", "Electronics", 42000, "2023-12-15", "2026-12-15", 36, 4);
		Products p24 = new Products("Motherboard", "Electronics", 18000, "2024-01-20", "2027-01-20", 36, 6);
		Products p25 = new Products("Processor", "Electronics", 32000, "2024-01-25", "2027-01-25", 36, 5);
		Products p26 = new Products("RAM 8GB", "Electronics", 3500, "2024-02-01", "2026-02-01", 24, 25);
		Products p27 = new Products("RAM 16GB", "Electronics", 6200, "2024-02-01", "2026-02-01", 24, 18);
		Products p28 = new Products("Laptop Bag", "Accessories", 1200, "2024-03-01", "2025-03-01", 12, 40);
		Products p29 = new Products("Cooling Pad", "Accessories", 1800, "2024-03-05", "2026-03-05", 24, 22);
		Products p30 = new Products("Projector", "Electronics", 28000, "2023-11-10", "2026-11-10", 36, 3);

		Products p31 = new Products("HDMI Cable", "Accessories", 600, "2024-01-10", "2026-01-10", 24, 100);
		Products p32 = new Products("VGA Cable", "Accessories", 450, "2024-01-12", "2026-01-12", 24, 80);
		Products p33 = new Products("Ethernet Cable", "Networking", 300, "2024-02-15", "2026-02-15", 24, 150);
		Products p34 = new Products("WiFi Extender", "Networking", 4200, "2024-02-20", "2026-02-20", 24, 14);
		Products p35 = new Products("NAS Storage", "Storage", 55000, "2023-10-10", "2028-10-10", 60, 2);
		Products p36 = new Products("Scanner", "Electronics", 11000, "2023-11-18", "2026-11-18", 36, 6);
		Products p37 = new Products("Barcode Scanner", "Electronics", 9000, "2024-01-15", "2027-01-15", 36, 8);
		Products p38 = new Products("POS Machine", "Electronics", 26000, "2023-12-01", "2026-12-01", 36, 4);
		Products p39 = new Products("Digital Camera", "Electronics", 48000, "2023-09-20", "2026-09-20", 36, 3);
		Products p40 = new Products("Tripod Stand", "Accessories", 2200, "2024-02-05", "2026-02-05", 24, 15);

		Products p41 = new Products("VR Headset", "Gaming", 35000, "2024-01-08", "2027-01-08", 36, 5);
		Products p42 = new Products("Game Controller", "Gaming", 4200, "2024-02-12", "2026-02-12", 24, 20);
		Products p43 = new Products("Gaming Chair", "Furniture", 18000, "2023-12-22", "2026-12-22", 36, 7);
		Products p44 = new Products("Gaming Desk", "Furniture", 24000, "2023-11-30", "2026-11-30", 36, 5);
		Products p45 = new Products("Office Chair", "Furniture", 9500, "2024-01-18", "2027-01-18", 36, 14);
		Products p46 = new Products("Office Table", "Furniture", 12500, "2023-12-10", "2026-12-10", 36, 9);
		Products p47 = new Products("LED Bulb", "Electrical", 350, "2024-03-01", "2026-03-01", 24, 200);
		Products p48 = new Products("Extension Board", "Electrical", 1200, "2024-02-22", "2026-02-22", 24, 60);
		Products p49 = new Products("Ceiling Light", "Electrical", 3200, "2024-01-28", "2027-01-28", 36, 18);
		Products p50 = new Products("Smart Plug", "Smart Home", 1800, "2024-02-14", "2026-02-14", 24, 30);

		Products p51 = new Products("Smart Bulb", "Smart Home", 2200, "2024-02-18", "2026-02-18", 24, 25);
		Products p52 = new Products("Smart Door Lock", "Smart Home", 16500, "2023-12-05", "2026-12-05", 36, 6);
		Products p53 = new Products("CCTV Camera", "Security", 4200, "2024-01-10", "2027-01-10", 36, 20);
		Products p54 = new Products("DVR", "Security", 9800, "2023-11-15", "2026-11-15", 36, 8);
		Products p55 = new Products("NVR", "Security", 13500, "2023-11-15", "2026-11-15", 36, 5);
		Products p56 = new Products("Biometric Machine", "Security", 14500, "2024-01-05", "2027-01-05", 36, 6);
		Products p57 = new Products("Fire Alarm", "Safety", 5200, "2024-02-02", "2027-02-02", 36, 10);
		Products p58 = new Products("Smoke Detector", "Safety", 2600, "2024-02-02", "2027-02-02", 36, 18);
		Products p59 = new Products("Water Purifier", "Home Appliances", 18500, "2023-10-25", "2028-10-25", 60, 7);
		Products p60 = new Products("Vacuum Cleaner", "Home Appliances", 13500, "2023-12-12", "2026-12-12", 36, 9);

		Products p61 = new Products("Air Purifier", "Home Appliances", 22000, "2023-11-08", "2026-11-08", 36, 6);
		Products p62 = new Products("Induction Stove", "Home Appliances", 4200, "2024-01-20", "2026-01-20", 24, 20);
		Products p63 = new Products("Mixer Grinder", "Home Appliances", 6500, "2023-12-05", "2026-12-05", 36, 15);
		Products p64 = new Products("Electric Kettle", "Home Appliances", 2800, "2024-02-01", "2026-02-01", 24, 22);
		Products p65 = new Products("Coffee Maker", "Home Appliances", 8200, "2023-11-22", "2026-11-22", 36, 6);
		Products p66 = new Products("Iron Box", "Home Appliances", 3200, "2024-01-12", "2026-01-12", 24, 25);
		Products p67 = new Products("Hair Dryer", "Personal Care", 2600, "2024-02-18", "2026-02-18", 24, 18);
		Products p68 = new Products("Trimmer", "Personal Care", 1900, "2024-01-25", "2026-01-25", 24, 30);
		Products p69 = new Products("Electric Toothbrush", "Personal Care", 3500, "2024-02-10", "2026-02-10", 24, 20);
		Products p70 = new Products("Weighing Machine", "Personal Care", 2800, "2024-01-15", "2026-01-15", 24, 14);

		Products p71 = new Products("Treadmill", "Fitness", 52000, "2023-09-15", "2026-09-15", 36, 3);
		Products p72 = new Products("Dumbbell Set", "Fitness", 6500, "2024-01-05", "2026-01-05", 24, 10);
		Products p73 = new Products("Exercise Cycle", "Fitness", 18500, "2023-10-20", "2026-10-20", 36, 4);
		Products p74 = new Products("Yoga Mat", "Fitness", 1200, "2024-02-28", "2026-02-28", 24, 40);
		Products p75 = new Products("Smart TV", "Electronics", 48000, "2023-11-01", "2026-11-01", 36, 5);
		Products p76 = new Products("Sound Bar", "Audio", 22000, "2023-12-15", "2026-12-15", 36, 6);
		Products p77 = new Products("Home Theatre", "Audio", 42000, "2023-10-10", "2026-10-10", 36, 4);
		Products p78 = new Products("FM Radio", "Audio", 1800, "2024-02-12", "2026-02-12", 24, 25);
		Products p79 = new Products("Car Charger", "Automobile", 1200, "2024-01-08", "2026-01-08", 24, 50);
		Products p80 = new Products("Dash Camera", "Automobile", 9500, "2023-12-01", "2026-12-01", 36, 7);

		Products p81 = new Products("Tyre Inflator", "Automobile", 3800, "2024-01-20", "2026-01-20", 24, 15);
		Products p82 = new Products("Power Inverter", "Automobile", 7200, "2023-11-18", "2026-11-18", 36, 8);
		Products p83 = new Products("Car Vacuum Cleaner", "Automobile", 4200, "2024-02-05", "2026-02-05", 24, 12);
		Products p84 = new Products("Electric Scooter", "Automobile", 78000, "2023-08-25", "2026-08-25", 36, 2);
		Products p85 = new Products("EV Charger", "Automobile", 52000, "2023-09-30", "2028-09-30", 60, 3);
		Products p86 = new Products("Solar Panel", "Renewable", 65000, "2023-07-10", "2028-07-10", 60, 4);
		Products p87 = new Products("Solar Inverter", "Renewable", 42000, "2023-07-10", "2028-07-10", 60, 5);
		Products p88 = new Products("Solar Battery", "Renewable", 38000, "2023-07-10", "2028-07-10", 60, 6);
		Products p89 = new Products("Power Tool Kit", "Tools", 18500, "2023-12-05", "2026-12-05", 36, 7);
		Products p90 = new Products("Drill Machine", "Tools", 6200, "2024-01-10", "2026-01-10", 24, 14);

		Products p91 = new Products("Angle Grinder", "Tools", 5400, "2024-01-12", "2026-01-12", 24, 12);
		Products p92 = new Products("Heat Gun", "Tools", 3600, "2024-02-08", "2026-02-08", 24, 10);
		Products p93 = new Products("Measuring Tape", "Tools", 450, "2024-02-20", "2026-02-20", 24, 80);
		Products p94 = new Products("Laser Level", "Tools", 9800, "2023-11-28", "2026-11-28", 36, 6);
		Products p95 = new Products("Tool Box", "Tools", 2600, "2024-01-18", "2026-01-18", 24, 20);
		Products p96 = new Products("White Board", "Office Supplies", 3200, "2024-01-05", "2026-01-05", 24, 10);
		Products p97 = new Products("Projector Screen", "Office Supplies", 8500, "2023-12-20", "2026-12-20", 36, 5);
		Products p98 = new Products("Paper Shredder", "Office Supplies", 12500, "2023-11-12", "2026-11-12", 36, 6);
		Products p99 = new Products("Laminator", "Office Supplies", 4200, "2024-01-22", "2026-01-22", 24, 9);
		Products p100 = new Products("Cash Counter", "Office Supplies", 18500, "2023-10-15", "2026-10-15", 36, 4);

		List<Products> pros = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17,
				p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59,
				p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, p76, p77, p78, p79, p80,
				p81, p82, p83, p84, p85, p86, p87, p88, p89, p90, p91, p92, p93, p94, p95, p96, p97, p98, p99, p100);

		pc.addMulProducts(pros);

		Products pUp = new Products("DataCable", "Accessories", 1500, "11-01-2024", "11-04-2029", 12, 60);

		pc.updateProductById(21, pUp);

		pc.deleteProductById(21);

		pc.getProductById(4);

		pc.getAllProducts();

		pc.getProductsByCategory("home appliances");

		pc.getProductsByName("fan");

		pc.getProductsPriceLessThan(200);

		pc.getProductsBetweenPrice(10000, 15000);

		pc.getProductsOrderByPriceAsc();

		pc.getProductsOrderByPriceDesc();

		pc.getProductsWithWarrantyGreaterThan(50);

		pc.getAvailableProducts();

		pc.getOutOfStockProducts();

		pc.getProductsManufacturedAfter("2024-03-01");

		pc.getProductsExpiringBefore("2027-03-01");

	}

}
