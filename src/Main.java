// Main class for the DroneCLI program
/*
 * public class DroneCLI { // Private variables for menu items private String[]
 * menuItems = { "Add new records", "Edit/Delete records", "Search" };
 * 
 * // Array of functions corresponding to menu items private Consumer<Void>[]
 * menuFunctions = { this::addNewRecords, this::editOrDeleteRecords,
 * this::search };
 * 
 * // Instance variables for PrintWriter and Scanner private PrintWriter
 * printWriter; private Scanner scanner;
 * 
 * // Constructor to initialize PrintWriter and Scanner public DroneCLI() {
 * this.printWriter = new PrintWriter(System.out); this.scanner = new
 * Scanner(System.in); }
 * 
 * // Menu method public void menu() { //user input is not 'q' keep looping,
 * else exit program and quit
 * printWriter.println("Welcome to our Drone management service!");
 * 
 * while (true) { //Output the options to the user
 * printWriter.println("Options are below as follows:");
 * 
 * // Print menu items for (int i = 0; i < menuItems.length; i++) {
 * printWriter.println((i + 1) + ". " + menuItems[i]); }
 * 
 * // Take in user input String input = scanner.next();
 * 
 * // Check if the input is "q" to quit if (input.equalsIgnoreCase("q")) {
 * printWriter.println("Exiting program. Goodbye!"); return; // Exit the method
 * or loop }
 * 
 * // Parse the input as an integer int choice; try { choice =
 * Integer.parseInt(input); } catch (NumberFormatException e) {
 * printWriter.println("Invalid input. Please enter a number or 'q' to quit.");
 * continue; // Continue to the next iteration of the loop }
 * 
 * // Process user choice if (choice >= 1 && choice <= menuItems.length) {
 * menuFunctions[choice - 1].accept(null); // Call the corresponding function }
 * else { printWriter.
 * println("Invalid choice. Please enter a number within the menu range or 'q' to quit."
 * ); } } }
 * 
 * // Function to add new records private void addNewRecords(Void unused) {
 * printWriter.println("Function for adding new records"); }
 * 
 * // Function to edit or delete records private void editOrDeleteRecords(Void
 * unused) { printWriter.println("Function for editing or deleting records"); }
 * 
 * // Function to search private void search(Void unused) {
 * printWriter.println("Function for searching"); }
 * 
 * public static void main(String[] args) { // Create DroneCLI object DroneCLI
 * droneCLI = new DroneCLI();
 * 
 * // Call the menu method droneCLI.menu();
 * 
 * // Close the PrintWriter and Scanner objects (optional)
 * droneCLI.printWriter.close(); droneCLI.scanner.close(); } }
 */
