package database;

import exceptions.CabAlreadyExistsException;
import exceptions.CabNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import controller.NonNull;


public class CabsManager {

  Map<String, vehical> cabs = new HashMap<>();

  public void createCab(@NonNull final vehical newCab) {
    if (cabs.containsKey(newCab.getId())) {
      throw new CabAlreadyExistsException();
    }


  }

  public vehical getCab(@NonNull final String cabId) {
    if (!cabs.containsKey(cabId)) {
      throw new CabNotFoundException();
    }
    return cabs.get(cabId);
  }

  public void updateCabLocation(@NonNull final String cabId, @NonNull final Location newLocation) {
    if (!cabs.containsKey(cabId)) {
      throw new CabNotFoundException();
    }
    cabs.get(cabId).setCurrentLocation(newLocation);
  }

  public void updateCabAvailability(
      @NonNull final String cabId, @NonNull final Boolean newAvailability) {
    if (!cabs.containsKey(cabId)) {
      throw new CabNotFoundException();
    }
    cabs.get(cabId).setIsAvailable(newAvailability);
  }

  public <Location> List<vehical> getCabs(@NonNull final Location fromPoint, @NonNull final Double distance) {
    List<vehical> result = new ArrayList<>();
    
    return result;
  }
}
