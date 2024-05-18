package JAVA;

public class AddressBook {
    private static final int MAX_ENTRIES = 100;

    private AddressBookEntry[] entries;
    private int entryCount;

    public AddressBook() {
        entries = new AddressBookEntry[MAX_ENTRIES];
        entryCount = 0;
    }

    public void addEntry(AddressBookEntry entry) {
        if (entryCount < MAX_ENTRIES) {
            entries[entryCount] = entry;
            entryCount++;
            System.out.println("Entry added: " + entry.getName());
        } else {
            System.out.println("Address book is full. Cannot add more entries.");
        }
    }
    public void deleteEntry(int index) {
        if (index >= 0 && index < entryCount) {
            for (int i = index; i < entryCount - 1; i++) {
                entries[i] = entries[i + 1];
            }
            entries[entryCount - 1] = null;
            entryCount--;
            System.out.println("Entry deleted at index: " + index);
        } else {
            System.out.println("Invalid index. Cannot delete entry.");
        }
    }

    public void viewAllEntries() {
        if (entryCount == 0) {
            System.out.println("Address book is empty.");
        } else {
            System.out.println("Entries in the address book:");
            for (int i = 0; i < entryCount; i++) {
                AddressBookEntry entry = entries[i];
                System.out.println("Entry " + (i + 1) + ": " + entry.getName() + ", " + entry.getAddress() + ", " + entry.getPhoneNumber() + ", " + entry.getEmailAddress());
            }
        }
    }
    public void updateEntry(int index, AddressBookEntry newEntry) {
        if (index >= 0 && index < entryCount) {
            entries[index] = newEntry;
            System.out.println("Entry updated at index: " + index);
        } else {
            System.out.println("Invalid index. Cannot update entry.");
        }
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.addEntry(new AddressBookEntry("John Lapuz", "123 Sampaloc St", "989-298-3908", "johnlapuz@mail.com"));
        addressBook.addEntry(new AddressBookEntry("Jane De Leon", "456 Tolentino St", "916-298-8765", "janeDL@mail.com"));

        // View all entries
        addressBook.viewAllEntries();

        // Update an entry
        AddressBookEntry updatedEntry = new AddressBookEntry("Sam Smith", "789 Adelina St", "956-298-3975", "samsmith@mail.com");
        addressBook.updateEntry(0, updatedEntry);

        // View all entries after update
        addressBook.viewAllEntries();

        // Delete an entry
        addressBook.deleteEntry(1);

        // View all entries after deletion
        addressBook.viewAllEntries();
    }
}

