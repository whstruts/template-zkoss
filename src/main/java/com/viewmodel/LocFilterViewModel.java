package com.viewmodel;

import com.model.LocData;
import com.model.Location;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;

import java.util.List;

public class LocFilterViewModel {
    private LocFilter locFilter = new LocFilter();
    List<Location> currentLoc = LocData.getAllLocations();
    public LocFilter getLocFilter() {
        return locFilter;
    }
    public ListModel<Location> getLocationModel() {
        return new ListModelList<Location>(currentLoc);
    }
    @Command
    @NotifyChange({"locationModel"})
    public void changeFilter() {
        currentLoc = LocData.getFilterLocations(locFilter);
    }
    @Command
    public void toIndex() {
        Executions.sendRedirect("tables.zul");
    }
}
