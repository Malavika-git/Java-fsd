import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Camera {
    String brand;
    String model;
    double rentalAmount;

    public Camera(String brand, String model,double rentalAmount) {
        this.brand = brand;
        this.model = model;
        this.rentalAmount = rentalAmount;
    }

    @Override
   public String toString() {
    	 return brand + " " + model + " - $" + rentalAmount + " per day";
    }
   
}
public class CameraRentalApp {
	 
	   
	private static ArrayList<Camera> cameraList = new ArrayList<>();
    private static double walletAmount = 1000; // Initial wallet balance
    

    public static void main(String[] args) {
        displayWelcomeScreen();
        

        Scanner scanner = new Scanner(System.in);
       
        int choice;

        do {
            displayOptions();
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        addCamera(scanner);
                        break;
                    case 2:
                        listCameras();
                        break;
                    case 3:
                        rentCamera(scanner);
                        break;
                    case 4:
                        MyWallet(scanner);
                        break;
                    case 5:
                    	removeCamera(scanner);
                    	break;
                    case 6:
                        ViewToMainContext();
                        break;
                   
                    case 7:
                        closeApplication();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } while (choice != 7);

        scanner.close();
    }

    

	private static void displayWelcomeScreen() {
        System.out.println("Welcome to RentMyCam");
        System.out.println("User Details");
        
       }
	
    private static void displayOptions() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add a Camera");
        System.out.println("2. List Cameras");
        System.out.println("3. Rent a Camera");
        System.out.println("4. My Wallet Amount");
        System.out.println("5. Remove Camera");
        System.out.println("6. View to Main Context");
        System.out.println("7. Close Application");
    }

    private static void addCamera(Scanner scanner) {
        System.out.println("\nEnter Camera Details:");
        System.out.print("Brand: ");
        String brand = scanner.next();
        System.out.print("Model: ");
        String model = scanner.next();
        System.out.print("Per-day Rental Amount: $" );
        double rentalAmount  = scanner.nextDouble();

        Camera newCamera = new Camera(brand, model, rentalAmount);
        cameraList.add(newCamera);

        System.out.println("Camera added successfully!");
    }

    private static void listCameras() {
        System.out.println("\nAvailable Cameras:");
        if (cameraList.isEmpty()) {
            System.out.println("No Data Present at This Moment.");
        } else {
            Collections.sort(cameraList, Comparator.comparing(camera -> camera.brand));
            for (Camera camera : cameraList) {
                System.out.println(camera);
            }
        }
    }

    private static void rentCamera(Scanner scanner) {
        listCameras();
        if (!cameraList.isEmpty()) {
            System.out.println("\nEnter the index of the camera you want to rent:");
            int index = scanner.nextInt();

            if (index >= 0 && index < cameraList.size()) {
                Camera selectedCamera = cameraList.get(index);

                if (walletAmount >= selectedCamera.rentalAmount) {
                    walletAmount -= selectedCamera.rentalAmount;
                    System.out.println("You have rented: " + selectedCamera);
                    System.out.println("Remaining Wallet Amount: $" + walletAmount);
                } else {
                    System.out.println("Transaction failed due to insufficient wallet amount to rent the camera.");
                }
            } else {
                System.out.println("Invalid camera index.");
            }
        }
    }

    private static void MyWallet(Scanner scanner) {
        System.out.println("\nWallet Amount: $" + walletAmount);
        System.out.println("1. Add money to Wallet");
        System.out.println("2. Back to Main Menu");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount to add: $");
                double amount = scanner.nextDouble();
                walletAmount += amount;
                System.out.println("Amount added to wallet. Updated balance: $" + walletAmount);
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice. Returning to main menu.");
        }
    }
    private static void removeCamera(Scanner scanner) {
    	int index = scanner.nextInt();

        if (index >= 0 && index < cameraList.size()) {
            Camera removeCamera = cameraList.remove(index);
            System.out.println("Camera remove: " + removeCamera);
        }
        else {
            System.out.println("Invalid camera index. No camera removed.");
        }
    }
    private static void ViewToMainContext() {
        System.out.println("\n View to the main context...");
        // Implement navigation logic if needed
    }
    

    private static void closeApplication() {
        System.out.println("\nClosing the application. Thank you for using RentMyCam.io!");
       
    }
}

