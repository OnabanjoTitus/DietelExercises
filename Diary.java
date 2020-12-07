public class Diary {
private Entry[] entries;
    public Diary(int numberOfDiaryEntries) {
    entries= new Entry[numberOfDiaryEntries];
    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry newDiaryEntry) {
       for(int counter=0;counter<entries.length;counter++){
           if(entries[counter]==null){
               entries[counter]=newDiaryEntry;
               break;
           }

       }

   }


    }

