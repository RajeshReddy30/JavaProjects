package com.xworkz.app.Dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PubDto {
    public String pubName;
    public String location;
    public String owner;
    public double rating;
    public int capacity;
    public LocalDate opendedDate;
    public LocalDateTime renevotatedDateTime;

    public PubDto() {
        System.out.println("No-argument constructor");
    }

    public PubDto(String pubName, String location, String owner, double rating, int capacity, LocalDate opendedDate,
                  LocalDateTime renevotatedDateTime) {
        this.pubName = pubName;
        this.location = location;
        this.owner = owner;
        this.rating = rating;
        this.capacity = capacity;
        this.opendedDate = opendedDate;
        this.renevotatedDateTime = renevotatedDateTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + capacity;
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((opendedDate == null) ? 0 : opendedDate.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        long temp;
        temp = Double.doubleToLongBits(rating);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((renevotatedDateTime == null) ? 0 : renevotatedDateTime.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PubDto other = (PubDto) obj;
        if (capacity != other.capacity)
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (opendedDate == null) {
            if (other.opendedDate != null)
                return false;
        } else if (!opendedDate.equals(other.opendedDate))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
            return false;
        if (renevotatedDateTime == null) {
            if (other.renevotatedDateTime != null)
                return false;
        } else if (!renevotatedDateTime.equals(other.renevotatedDateTime))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pub [pubName=" + pubName + ", location=" + location + ", owner=" + owner + ", rating=" + rating
                + ", capacity=" + capacity + ", opendedDate=" + opendedDate + ", renevotatedDateTime="
                + renevotatedDateTime + "]";
    }
}

