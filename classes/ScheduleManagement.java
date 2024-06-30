package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScheduleManagement {
    private List<Schedule> schedules;
    private static final String FILENAME = "schedules.txt";

    public ScheduleManagement() {
        schedules = new ArrayList<>();
        loadSchedulesFromFile();
    }

    public void runScheduleManagement() {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            printMenu();
            choice = readIntegerInput(scanner);

            switch (choice) {
                case 1:
                    addSchedule(scanner);
                    break;
                case 2:
                    viewSchedules();
                    break;
                case 3:
                    editSchedule(scanner);
                    break;
                case 4:
                    deleteSchedule(scanner);
                    break;
                case 5:
                    saveSchedulesToFile();
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private void printMenu() {
        System.out.println("========================================");
        System.out.println("|         JAVA CHIPS UNIVERSITY         |");
        System.out.println("========================================");
        System.out.println("--- School Management System ---");
        System.out.println("------ Schedule Management ------");
        System.out.println("=========== MENU ===========");
        System.out.println("[1] Add Schedule");
        System.out.println("[2] View Schedules");
        System.out.println("[3] Edit Schedule");
        System.out.println("[4] Delete Schedule");
        System.out.println("[5] Exit");
        System.out.println("============================");
        System.out.print("Enter your choice: ");
    }

    private void addSchedule(Scanner scanner) {
        System.out.println("\nAdd Schedule:");

        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.println("course code: " + courseCode);

        System.out.print("Enter course title: ");
        String courseTitle = scanner.nextLine();
        System.out.println("course title: " + courseTitle);

        int units;
        while (true) {
            System.out.print("Enter units: ");
            if (scanner.hasNextInt()) {
                units = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.println("units: " + units);
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        int yearLevel;
        while (true) {
            System.out.print("Enter year level: ");
            if (scanner.hasNextInt()) {
                yearLevel = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                System.out.println("year level: " + yearLevel);
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        System.out.print("Enter section: ");
        String section = scanner.nextLine();
        System.out.println("section: " + section);

        System.out.print("Enter day: ");
        String day = scanner.nextLine();
        System.out.println("day: " + day);

        System.out.print("Enter time: ");
        String time = scanner.nextLine();
        System.out.println("time: " + time);

        System.out.print("Enter room: ");
        String room = scanner.nextLine();
        System.out.println("room: " + room);

        Course course = new Course(courseCode, courseTitle);
        Schedule newSchedule = new Schedule(course, units, yearLevel, section, day, time, room);
        schedules.add(newSchedule);
        saveSchedulesToFile();
        System.out.println("Schedule added successfully.");
    }

    private void viewSchedules() {
        System.out.println("\nView Schedules:");
        if (schedules.isEmpty()) {
            System.out.println("No schedules available.");
        } else {
            for (int i = 0; i < schedules.size(); i++) {
                System.out.println("Schedule " + (i + 1) + ":");
                System.out.println(schedules.get(i));
            }
        }
    }

    private void editSchedule(Scanner scanner) {
        System.out.println("\nEdit Schedule:");
        if (schedules.isEmpty()) {
            System.out.println("No schedules available to edit.");
            return;
        }

        System.out.print("Enter index of schedule to edit (1-" + schedules.size() + "): ");
        int index = readIntegerInput(scanner) - 1;

        if (index < 0 || index >= schedules.size()) {
            System.out.println("Invalid schedule index.");
        } else {
            System.out.print("Enter new course code: ");
            String courseCode = scanner.next();
            scanner.nextLine(); // Consume newline left-over
            System.out.println("new course code: " + courseCode);

            System.out.print("Enter new course title: ");
            String courseTitle = scanner.nextLine();
            System.out.println("new course title: " + courseTitle);

            int newUnits;
            while (true) {
                System.out.print("Enter new units: ");
                if (scanner.hasNextInt()) {
                    newUnits = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.println("new units: " + newUnits);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // Consume invalid input
                }
            }

            int newYearLevel;
            while (true) {
                System.out.print("Enter new year level: ");
                if (scanner.hasNextInt()) {
                    newYearLevel = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.println("new year level: " + newYearLevel);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine(); // Consume invalid input
                }
            }

            System.out.print("Enter new section: ");
            String newSection = scanner.nextLine();
            System.out.println("new section: " + newSection);

            System.out.print("Enter new day: ");
            String newDay = scanner.nextLine();
            System.out.println("new day: " + newDay);

            System.out.print("Enter new time: ");
            String newTime = scanner.nextLine();
            System.out.println("new time: " + newTime);

            System.out.print("Enter new room: ");
            String newRoom = scanner.nextLine();
            System.out.println("new room: " + newRoom);

            Course course = new Course(courseCode, courseTitle);
            Schedule updatedSchedule = new Schedule(course, newUnits, newYearLevel, newSection, newDay, newTime, newRoom);
            schedules.set(index, updatedSchedule);
            saveSchedulesToFile();
            System.out.println("Schedule updated successfully.");
        }
    }

    private void deleteSchedule(Scanner scanner) {
        System.out.println("\nDelete Schedule:");
        if (schedules.isEmpty()) {
            System.out.println("No schedules available to delete.");
            return;
        }

        System.out.print("Enter index of schedule to delete (1-" + schedules.size() + "): ");
        int index = readIntegerInput(scanner) - 1;

        if (index < 0 || index >= schedules.size()) {
            System.out.println("Invalid schedule index.");
        } else {
            schedules.remove(index);
            saveSchedulesToFile();
            System.out.println("Schedule deleted successfully.");
        }
    }

    private void loadSchedulesFromFile() {
        try (Scanner fileScanner = new Scanner(new File(FILENAME))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length != 8) {
                    System.err.println("Invalid format in file: " + FILENAME);
                    continue;
                }
                String courseCode = parts[0];
                String courseTitle = parts[1];
                int units = Integer.parseInt(parts[2]);
                int yearLevel = Integer.parseInt(parts[3]);
                String section = parts[4];
                String day = parts[5];
                String time = parts[6];
                String room = parts[7];

                Course course = new Course(courseCode, courseTitle);
                Schedule schedule = new Schedule(course, units, yearLevel, section, day, time, room);
                schedules.add(schedule);
            }
            System.out.println("Schedules loaded from file: " + FILENAME);
        } catch (FileNotFoundException e) {
            System.out.println("No schedules found. File will be created when you add schedules.");
        } catch (NumberFormatException e) {
            System.err.println("Error parsing data from file: " + e.getMessage());
        }
    }

    private void saveSchedulesToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Schedule schedule : schedules) {
                writer.println(schedule.toFileString());
            }
            System.out.println("Schedules saved to file: " + FILENAME);
        } catch (IOException e) {
            System.err.println("Error saving schedules to file: " + e.getMessage());
        }
    }

    private static int readIntegerInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        int input = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        return input;
    }

    public static void main(String[] args) {
        ScheduleManagement manager = new ScheduleManagement();
        manager.runScheduleManagement();
    }
}
