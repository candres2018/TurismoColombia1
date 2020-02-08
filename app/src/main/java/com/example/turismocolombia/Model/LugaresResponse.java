package com.example.turismocolombia.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LugaresResponse {
    @SerializedName("LugarT")
    @Expose
    private List<LugarT> lugares = null;

    public List<LugarT> getLugares() {
        return lugares;
    }

    public void setLugares(List<LugarT> lugares) {
        this.lugares = lugares;
    }
}
