package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /** Add entry from entries collection*/  
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

     /** Remove entry from entries collection*/   
    public void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

     /** Return int size of entries*/  
    public int size() {
        return entries.size();
    }

    /** Get(int) index of type TimeEntry from entries*/        
    public TimeEntry get(final int index) {
         return entries.get(index);
    }
}
