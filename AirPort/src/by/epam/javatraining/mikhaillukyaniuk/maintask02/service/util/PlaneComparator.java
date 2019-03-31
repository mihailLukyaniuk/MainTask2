/**
 * Created by Mikhail Lukyaniuk 31.03.2019
 */
package by.epam.javatraining.mikhaillukyaniuk.maintask02.service.util;

import java.util.Comparator;

import by.epam.javatraining.mikhaillukyaniuk.maintask02.model.entities.AirVehicle;

public class PlaneComparator implements Comparator<AirVehicle> {
    private ItemEnum sortingItem;

    public PlaneComparator(ItemEnum sortingItem) {
            setSortingItem(sortingItem);
    }

    public void setSortingItem(ItemEnum sortingItem) {
        this.sortingItem = sortingItem;
    }

    public ItemEnum getSortingItem() {
        return sortingItem;
    }

    @Override
    public int compare(AirVehicle planeOne, AirVehicle planeTwo) {
        switch (sortingItem) {
            case DISTANCE_OF_FLIGHT:
                double flyDistanceOne = planeOne.getRangeOfFlight();
                double flyDistanceTwo = planeTwo.getRangeOfFlight();
                if (flyDistanceOne > flyDistanceTwo) {
                    return 1;
                }
                if (flyDistanceOne < flyDistanceTwo) {
                    return -1;
                }
                return 0;
            case FUEL_CONSUMPTION:
                double fuelConsumptionOne = planeOne.getFuelConsumption();
                double fuelConsumptionTwo = planeTwo.getFuelConsumption();
                if (fuelConsumptionOne < fuelConsumptionTwo) {
                    return 1;
                }
                if (fuelConsumptionOne > fuelConsumptionTwo) {
                    return -1;
                }
                return 0;
            default:
                return 0;
        }
    }

    public enum ItemEnum {
        DISTANCE_OF_FLIGHT("fly distance"), FUEL_CONSUMPTION("fuel consumption");
        private String typeSort;
        ItemEnum(String key){
            this.typeSort = key;
        }

        public String getTypeSort (){
            return this.typeSort;
        }
    }
}
