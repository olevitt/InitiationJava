package fr.intech.tp2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

    @JsonProperty("start_page")
    private int startPage;

    @JsonProperty("items_on_page")
    private int itemsOnPage;

    @JsonProperty("items_per_page")
    private int itemsPerPage;

    @JsonProperty("total_result")
    private int totalResult;

}
