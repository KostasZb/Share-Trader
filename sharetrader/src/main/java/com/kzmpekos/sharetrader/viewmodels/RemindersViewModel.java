package com.kzmpekos.sharetrader.viewmodels;

import com.kzmpekos.sharetrader.models.Reminder;

import java.util.ArrayList;
import java.util.List;

public class RemindersViewModel extends BaseViewModel {
    private List<Reminder> reminders;

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    public RemindersViewModel() {
        this(new ArrayList<Reminder>());
    }

    public RemindersViewModel(List<Reminder> reminders) {

        super("reminders", "Reminders Page");
        setReminders(reminders);
    }
}
