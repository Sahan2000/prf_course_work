import java.util.*;
class CourseWork{
	public static Scanner input = new Scanner(System.in);
    public static String[] user = {"kashmi","1234"};
    public static String[][] item = new String[0][6];
    public static String[][] supplier = new String[0][2];
    public static String[] category = new String[0];
    public static void main(String[] args) {
        login();
          
    }
    
    public static void login(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\t\tLogin Page\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        L1:while (true) {
            System.out.print("User Name : ");
            String userName = input.next();
            if (!userName.equalsIgnoreCase(user[0])){
                System.out.println("user name is invalid. please try again!");
                continue L1;
            }else {
                break L1;
            }
        }
        while (true){
            System.out.print("Password : ");
            String password = input.next();
            if (password.equalsIgnoreCase(user[1])){
				clearConsole();
                homePage();
                break;
            }else {
                System.out.println("password is incorrect. please try again!");
                continue;
            }
        }
	}

    private final static void clearConsole() {
        final String os = System.getProperty("os.name");
        try {
            if (os.equals("Linux")) {
                System.out.print("\033\143");
            } else if (os.equals("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
//handle the exception
            System.err.println(e.getMessage());
        }
    }

    private static void homePage() {
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\tWELCOME TO IJSE STOCK MANAGEMENT SYSTEM\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("\n[1] Change the Credentials\t\t\t[2] Supplier manage");
        System.out.println("[3] Stock Manage\t\t\t\t[4] Log out");
        System.out.println("[5] Exit the System");
		
		
		
        System.out.print("\nEnter an option to continue > ");
        int option = input.nextInt();
        switch (option){
            case 1 :
                clearConsole();
                changeTheCredentials();
                break;
            case 2:
				clearConsole();
				supplierManage();
				break;
			case 3:
				clearConsole();
				stockManagement();
				break;
            case 4: 
				clearConsole();
				logout();
				clearConsole();
				break;
			case 5:
				System.exit(0);
        }
    }

    private static void changeTheCredentials(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tCREDENTIALS MANAGE\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        L3:while(true){
			L1:while(true){
				System.out.print("\nPlease enter the user name to verify it's you : ");
				String userName = input.next();
				if(userName.equalsIgnoreCase(user[0])){
					System.out.println("Hey " +userName);
					break L1;
				}else{
					System.out.println("Invalid user name.try again!");
					continue L1;
				}
			}
			L2:while(true){
				System.out.print("\nEnter your current password : ");
				String password = input.next();
				if(password.equalsIgnoreCase(user[1])){
					System.out.print("Enter your new password : ");
					String password1 = input.next();
					String[] temp = new String[2];
					for(int i=0; i<temp.length-1; i++){
						temp[i] = user[i];
					}
					temp[temp.length-1]=password1;
					user = temp;
					System.out.print("Password changed successfully! Do you want to go home page (Y/N) : ");
					String option = input.next();
					if(option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
						clearConsole();
						homePage();
						break L3;
					}if(option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
						continue L3;
					}
				}else{
					System.out.println("incorrect password. try again!");
					continue L2;
				}
			}
		}
    }
    
    public static void logout(){
		clearConsole();
		login();
	}
	
	public static void supplierManage(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tSUPPLIER MANAGE\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        System.out.println("\n[1] Add Supplier\t\t\t[2] Update Supplier");
        System.out.println("[3] Delete Supplier\t\t\t[4] View Suppliers");
        System.out.println("[5] Search Supplier\t\t\t[6] Home Page");
        
        System.out.print("\nEnter an option to continue > ");
        int option = input.nextInt();
        
        switch(option){
			case 1:
				clearConsole();
				addSupplier();
				break;
			case 2:
				clearConsole();
				updateSupplier();
				break;
			case 3: 
				clearConsole();
				deleteSupplier();
				break;
			case 4:
				clearConsole();
				viewSuppliers();
				break;
			case 5:
				clearConsole();
				searchSupplier();
				break;
			case 6:
				clearConsole();
				homePage();
		}
		
		
	}
	
	public static void addSupplier(){
		String[][] item = new String[0][7];
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tADD SUPPLIER\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        L1:while(true){
			System.out.print("\nSupplier ID : ");
			String id = input.next();
			
			//System.out.println(!duplicateSupplierId(id));
			if(!duplicateSupplierId(id)){
				System.out.print("Supplier Name : ");
				String name = input.next();
				
				String[][] temp = new String[supplier.length+1][2];
				for (int i = 0; i < temp.length-1; i++){
					temp[i][0]=supplier[i][0];
					temp[i][1]=supplier[i][1];
				}
				
				temp[temp.length-1][0]=id;
				temp[temp.length-1][1]=name;
				
				supplier =temp;
				
				System.out.print("added successfully! Do you want to add another supplier (Y/N) ? " );
				String option  = input.next();
				if(option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
					clearConsole();
					addSupplier();
					break L1;
				}else if(option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
					clearConsole();
					supplierManage();
					break L1;
				}
			}else{
				System.out.println("already exists. try another supplier id!");
			}
		}
	}
	
	public static boolean duplicateSupplierId(String id){
		for(int i=0; i<supplier.length; i++){
			if(id.equalsIgnoreCase(supplier[i][0])){
				return true;
			}
		}
		return false;
	}

	public static void updateSupplier(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tUPDATE SUPPLIER\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        L1:while(true){
			System.out.print("\nSupplier ID : ");
			String id = input.next();
			
			//System.out.println(name);
			if(duplicateSupplierId(id)){
				int index = getSupplierIndex(id);
				String name = supplier[index][1];
				
				System.out.println("Supplier Name : " + name);
				System.out.print("Enter the new supplier name : ");
				String newName = input.next();
				supplier[index][1] = newName;
				
				System.out.print("Updated Successfully! 	Do you want to update another supplier? (Y/N) : ");
				String option  = input.next();
				if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
					clearConsole();
					updateSupplier();
					break;
				}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
					clearConsole();
					supplierManage();
					break;
				}
			}else{
				System.out.println("can't find supplier id. try again!");
				continue L1;
			}
		}
	}
	
	public static int getSupplierIndex(String id){
		for (int i = 0; i < supplier.length; i++){
			if (id.equalsIgnoreCase(supplier[i][0])){
				return i;
			}
		}
		return -1;
	}
	
	public static void deleteSupplier(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tDELETE SUPPLIER\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        while(true){
			System.out.print("Supplier ID : ");
			String id = input.next();
        
			if(duplicateSupplierId(id)){
		
				int index = getSupplierIndex(id);
				supplier = deleteRowFromArray(supplier,index);
				System.out.print("deleted successfully! Do you want to delete another? (Y/N) ");
				String option = input.next();
				
				if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
					clearConsole();
					deleteSupplier();
					break;
				}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
					clearConsole();
					supplierManage();
					break;
				}
			}else{
				System.out.println("can't find supplier id. try again!");
				continue;
			}
		}
	}
	
	public static String[][] deleteRowFromArray(String[][] supplier, int index){
		if (index < 0 || index >= supplier.length) {
			return supplier;
		} else {
			String[][] temp = new String[supplier.length - 1][2];
			int tempIndex = 0;
			for (int i = 0; i < supplier.length; i++) {
				if (index != i) {
					temp[tempIndex][0] = supplier[i][0];
					temp[tempIndex][1] = supplier[i][1];
					tempIndex++;
				}
			}
			return temp;
		}	
	}
	
	public static void viewSuppliers(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tVIEW SUPPLIERS\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println();
        System.out.print("+");
        for (int i = 0; i <63; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\tSUPPLIER ID\t\t|\tSUPPLIER NAME\t\t|");
        System.out.print("+");
        for (int i = 0; i <63; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        for (int i = 0; i < supplier.length; i++){
			System.out.print("|\t\t" + supplier[i][0] + "\t\t|\t" + supplier[i][1] + "\t\t|\n");
		}
		System.out.print("+");
        for (int i = 0; i <63; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("Do you want to go supplier manage page (Y/N)? ");
        String option = input.next();
				
				if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
					clearConsole();
					supplierManage();
					
				}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
					clearConsole();
					searchSupplier();
					
				}
	}
	
	public static void searchSupplier(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tSEARCH SUPPLIER\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        while(true){
			System.out.print("\nSupplier ID : ");
			String id = input.next();
			if (duplicateSupplierId(id)){
				int index = getSupplierIndex(id);
				System.out.println("Supplier Name : " + supplier[index][1]);
				System.out.print("added successfully! Do you want to add another find (Y/N) ? ");
				String option  = input.next();
				if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
					clearConsole();
					searchSupplier();
					break;
				}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
					clearConsole();
					supplierManage();
					break;
				}
			}else{
				System.out.println("can't find supplier id. try again!");
				continue;
			}
		}
	}
	
	public static void stockManagement(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tSTOCK MANAGEMENT\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        System.out.println("\n[1] Manage Item Categories\t\t\t[2] Add Item");
        System.out.println("[3] Get Item Supplier Wise\t\t\t[4] View Items");
        System.out.println("[5] Rank Item Per Unit Price\t\t\t[6] Home Page");
        
        System.out.print("\nEnter an option to continue > ");
        int option = input.nextInt();
        
        switch(option){
			case 1:
				clearConsole();
				manageItemCategories();
				break;
			case 2:
				clearConsole();
				addItem();
				break;
			case 3: 
				clearConsole();
				getItemsSupplierWise();
				break;
			case 4:
				clearConsole();
				viewItems();
				break;
			case 5:
				clearConsole();
				rankItemsPerUnitPrice();
				break;
			case 6:
				clearConsole();
				homePage();
		}
	}
	
	public static void manageItemCategories(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tMANAGE ITEM CATEGORY\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        System.out.println("\n[1] Add New Item Category \t\t\t[2] Delete Item Category");
        System.out.println("[3] Update Item Category\t\t\t[4] Stock Management");
        
        System.out.print("\nEnter an option to continue > ");
        int option = input.nextInt();
        
        switch(option){
			case 1:
				clearConsole();
				addNewItemCategory();
				break;
			case 2:
				clearConsole();
				deleteItemCategory();
				break;
			case 3: 
				clearConsole();
				updateItemCategory();
				break;
			case 4:
				clearConsole();
				stockManagement();
				
		}
	}
	
	public static void addNewItemCategory(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tADD NEW ITEM CATEGORY\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        System.out.print("Enter the new item category : ");
        String categoryName = input.next();
        
        String[] temp = new String[category.length+1];
        for (int i = 0; i < category.length; i++){
			temp[i] = category[i];
		}
		temp[temp.length-1] = categoryName;
		category = temp;
		
		
		System.out.print("added successfully! Do you want to add another category (Y/N)? ");
		String option = input.next();
				
		if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
			clearConsole();
			addNewItemCategory();
					
		}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
			clearConsole();
			manageItemCategories();
		}
	}
	
	public static void deleteItemCategory(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tDELETE ITEM CATEGORY\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        while(true){
			System.out.print("\nEnter Item Category : ");
			String categoryName = input.next();
        
			if (isHaveCategoryName(categoryName)){
				int index = getCategoryArrayRowIndex(categoryName);
				category = deleteCategoryRowFromArray(category,index);
			
				System.out.print("deleted successfully! Do you want to delete another item category? (Y/N) ");
					String option = input.next();
				
					if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
						clearConsole();
						deleteItemCategory();
						break;
					}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
						clearConsole();
						manageItemCategories();
						break;
					}
			}else{
				System.out.println("can't find item category. try again!");
				continue;
			}
		}
	}
	
	public static boolean isHaveCategoryName(String categoryName){
		for (int i = 0; i < category.length; i++){
			if (categoryName.equalsIgnoreCase(category[i])){
				return true;
			}
		}
		return false;
	}
	
	public static int getCategoryArrayRowIndex(String categoryName){
		for (int i = 0; i < category.length; i++){
			if (categoryName.equalsIgnoreCase(category[i])){
				return i;
			}
		}
		return -1;
	}
	
	public static String[] deleteCategoryRowFromArray(String[] category,int index){
		if (index < 0 || index >= category.length) {
        return category;
		} else {
			String[] temp = new String[category.length - 1];
			int tempIndex = 0;
			for (int i = 0; i < category.length; i++) {
				if (index != i) {
					temp[i] = category[i];
					tempIndex++;
				}
			}
			return temp;
		}
	}
	
	public static void updateItemCategory(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tUPDATE ITEM CATEGORY\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        L1:while(true){
			System.out.print("\nEnter item category : ");
			String categoryName = input.next();
			
			//System.out.println(name);
			if(isHaveCategoryName(categoryName)){
				int index = getCategoryArrayRowIndex(categoryName);
				System.out.print("Enter the item category  : ");
				String newCategoryName = input.next();
				category[index] = newCategoryName;
				
				System.out.print("Updated Successfully! Do you want to update another item category? (Y/N) : ");
				String option  = input.next();
				if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
					clearConsole();
					updateItemCategory();
					break;
				}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
					clearConsole();
					manageItemCategories();
					break;
				}
			}else{
				System.out.println("can't find item category item. try again!");
				continue L1;
			}
		}
	}
	
	public static void addItem(){
		String opt = "Y";
		L1 : while(!opt.equals("N")){
			System.out.print("+");
			for (int i = 0; i <63; i++) {
				System.out.print("-");
			}
			System.out.println("+");
			System.out.print("|");
			System.out.println("\t\t\tADD ITEM\t\t\t\t|");
			System.out.print("+");
			for (int i = 0; i <63; i++) {
				System.out.print("-");
			}
			System.out.println("+");
        
			L2:while(true){
			
				if (!checkItemCategory()){
					System.out.print("OOPS! It seems thst you don't have a any item categories in the system.\nDo you want to add a new item category?(Y/N) ");
					String option = input.next();
				
					if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
						clearConsole();
						addNewItemCategory();
						break;
					}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
						clearConsole();
						stockManagement();
						break;
					}
					
				}else if (!checkSupplier()){
					System.out.print("OOPS! It seems thst you don't have a any supplier in the system.\nDo you want to add a new supplier?(Y/N) ");
					String option = input.next();
					
					if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("y")){
						clearConsole();
						addSupplier();
						break;
					}else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("n")){
						clearConsole();
						stockManagement();
						break;
					}
				}else{
					System.out.print("Item id : ");
					String itemCode = input.next();
					System.out.println();
					if (!duplicateItemId(itemCode)){
						System.out.println("Suppliers List : ");
				
						System.out.print("+");
						for (int i = 0; i <71; i++) {
							System.out.print("-");
						}
						System.out.println("+");
						System.out.print("|");
						System.out.println("\t#\t\t|\tSUPPLIER ID\t|\tSUPPLIER NAME\t|");
						System.out.print("+");
						for (int i = 0; i <71; i++) {
							System.out.print("-");
						}
						System.out.println("+");
						for (int i = 0; i < supplier.length; i++){
							System.out.print("|\t" + (i+1) +"\t\t" + "|\t" + supplier[i][0] + "\t\t|\t" + supplier[i][1] + "\t\t|\n");
						}
						System.out.print("+");
						for (int i = 0; i <71; i++) {
							System.out.print("-");
						}
						System.out.println("+");
					
						System.out.print("\nEnter the supplier number > ");
						int supplierNumber = input.nextInt();
				
						if (supplierNumber > 0 || supplierNumber <= supplier.length){
							String supplierId = supplier[supplierNumber-1][0];
					
							System.out.println("Item Catgories : ");
						
							System.out.print("+");
							for (int i = 0; i < 55; i++){
								System.out.print("-");
							}
							System.out.print("+");
							System.out.print("\n|\t#\t\t|\tCATEGORY NAME\t\t|\n");
							System.out.print("+");
							for (int i = 0; i < 55; i++){
								System.out.print("-");
							}
							System.out.println("+");
							for (int i = 0; i < category.length; i++){
								System.out.print("|\t" + (i+1) + "\t\t|\t" + category[i] + "\t\t\t|\n");
							}
							System.out.print("+");
							for (int i = 0; i < 55; i++){
								System.out.print("-");
							}
							System.out.print("+\n");
							
							System.out.print("Enter the category number : ");
							int categoryNumber= input.nextInt();
						
							if (categoryNumber > 0 || categoryNumber <= item.length){
								String categoryName = category[categoryNumber-1];
								int index = getCategoryArrayRowIndex(categoryName);
								System.out.print("Description : ");
								String description = input.next();
								System.out.print("Unit Price : ");
								String price = input.next();
								System.out.print("QTY on hand : ");
								String qty = input.next();
						
								String[][] temp = new String[item.length+1][6];
							
								for (int i = 0; i < item.length; i++){
									for (int j = 0; j < item[i].length; j++){
										temp[i][j] = item[i][j];
									}
								}
						
								temp[temp.length-1][0] = itemCode;
								temp[temp.length-1][1] = description;
								temp[temp.length-1][2] = qty;
								temp[temp.length-1][3] = price;
								temp[temp.length-1][4] = categoryName;
								temp[temp.length-1][5] = supplierId;
								item = temp;
								System.out.print("added successfully! Do you want to add another item(Y/N)? ");
								opt = input.next();
							
								if (opt.equalsIgnoreCase("Y") || opt.equalsIgnoreCase("y")){

									clearConsole();
									continue L1;
									
								}else if (opt.equalsIgnoreCase("N") || opt.equalsIgnoreCase("n")){
									clearConsole();
									stockManagement();
									break;
								}
							}
						}
					}else{
						System.out.println("already added. try another item code : ");
						continue L2;
					}
				}
			}
		}
	}
	
	public static boolean duplicateItemId(String code){
		for (int i = 0; i < item.length; i++){
        if (code.equals(item[i][0])){
            return true;
        }
    }
    return false;
	}
	
	public static boolean checkSupplier(){
		for (int i = 0; i < supplier.length; i++){
			if (supplier[i][0] != null && !supplier[i][0].isEmpty()){
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkItemCategory(){
		for (int i = 0; i < category.length; i++){
			if (category[i] != null && !category[i].isEmpty()){
				return true;
			}
		}
		return false;
	}
	
	public static void getItemsSupplierWise(){
		System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("|                            SEARCH SUPPLIER                                |");
        System.out.println("+---------------------------------------------------------------------------+\n");

        String option = "y";

        while (option.equals("y") || option.equals("Y")){
            System.out.print("\nEnter supplier Id : ");
            String inputted_supplier_id = input.next();

            boolean supplierValidity = checkSupplierValidity(inputted_supplier_id);

            while (!supplierValidity){
                System.out.println("Invalid supplier ID! Try again.");
                System.out.print("Enter supplier Id : ");
                inputted_supplier_id = input.next();
                supplierValidity = checkSupplierValidity(inputted_supplier_id);
            }

            String supplierName = getSupplierName(inputted_supplier_id);
            System.out.println("Supplier Name : "+supplierName);

            showItemsSupplierWiseInTable(inputted_supplier_id);
            System.out.print("Search Successfully! Do you want to another search (Y/N) : ");
            option = input.next();

        }
        clearConsole();
        stockManagement();
	}
	
	private static boolean checkSupplierValidity(String inputtedSupplierId) {
        for (int i = 0; i < supplier.length; i++) {
            if(supplier[i][0].equals(inputtedSupplierId)){
                return true;
            }
        }
        return false;
    }
    
    private static void showItemsSupplierWiseInTable(String inputtedSupplierId) {

        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.printf("|%-22s|%-22s|%-22s|%-22s|%-22s|\n", "ITEM CODE", "DESCRIPTION","UNIT PRICE","QTY ON HAND","CATEGORY");
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+");

        int count = 0 ;
        for (int i = 0; i < item.length; i++) {
            if(item[i][5].equals(inputtedSupplierId)){
                count++;
            }
        }

        String[][] temp = new String[count][6];
        int index = 0 ;
        for (int i = 0; i < item.length; i++) {
            if(item[i][5].equals(inputtedSupplierId)){
                for (int j = 0; j < 6; j++) {
                    temp[index][j] = item[i][j];
                }
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            String category_name = temp[i][4];
            System.out.printf("|%-22s|%-22s|%-22s|%-22s|%-22s|\n", temp[i][0], temp[i][1], temp[i][3], temp[i][2], category_name);
        }
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+");
    }
    
    private static String getSupplierName(String inputtedSupplierId) {
        for (int i = 0; i < supplier.length; i++) {
            if(supplier[i][0].equals(inputtedSupplierId)){
                return supplier[i][1];
            }
        }
        return null;
    }
	
	public static int getItemArraySearchBySupplierId(String id){
		for (int i = 0; i < item.length; i++){
			if (id.equalsIgnoreCase(item[i][5])){
				return i;
			}
		}
		return -1;
	}
	
	public static void viewItems(){
		System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.print("|");
        System.out.println("\t\t\tVIEW ITEMS\t\t\t\t\t|");
        System.out.print("+");
        for (int i = 0; i <71; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        
		
        for (int i = 0; i < category.length; i++){
			System.out.println(category[i] + ":");
			System.out.println("\n+-----------------------------------------------------------------------------------------------+");
			System.out.println("|\tItem ID   \t|\tDescription\t|\tUnit Price\t|\tQty on Hand\t|");
			System.out.println("+-----------------------------------------------------------------------------------------------+");
			for (int j = 0; j < item.length; j++){
				if(item[j][4].equalsIgnoreCase(category[i])){
					System.out.printf("|\t%-10s\t|\t%-18s\b\b|\t%-10s\t|\t%-12s\t|\n",item[j][0],item[j][1],item[j][2],item[j][3]);
					
				}else{
					continue;
				}
			}
			System.out.println("+-----------------------------------------------------------------------------------------------+");
		}
		
		System.out.println();
        System.out.println("Do you want to go stock manage page?(Y/N) ");
        String answer = input.next();
        if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("y")) {
            clearConsole();
            stockManagement();
        } else if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("n")) {
            clearConsole();
            viewItems();
        }
	}
	
	private static void rankItemsPerUnitPrice() {
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("|                            RANKED UNIT PRICE                              |");
        System.out.println("+---------------------------------------------------------------------------+\n");

        String[][] sorted_item_array = item;

        for (int i = 0; i <item.length; i++) {
            String[] temp=null;
            for (int j = 0; j < sorted_item_array.length-1; j++) {
                if(Integer.parseInt(sorted_item_array[j][3]) > Integer.parseInt(sorted_item_array[j+1][3])){
                    temp = sorted_item_array[j+1];
                    sorted_item_array[j+1] = sorted_item_array[j];
                    sorted_item_array[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.printf("|%-22s|%-22s|%-22s|%-22s|%-22s|%-22s|\n", "SID", "CODE", "DESC","PRICE","QTY","CAT");
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");

        for (int j = 0; j < sorted_item_array.length; j++) {
            System.out.printf("|%-22s|%-22s|%-22s|%-22s|%-22s|%-22s|\n", item[j][5], item[j][0] , item[j][1] , item[j][3] , item[j][2] , item[j][4]);
            System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        }
        System.out.println();


        System.out.print("Do you want to go stock manage page (Y/N) : ");
        String option = input.next();

        if(option.equals("y") || option.equals("Y")){
			clearConsole();
            stockManagement();
        }
    }

}

	
