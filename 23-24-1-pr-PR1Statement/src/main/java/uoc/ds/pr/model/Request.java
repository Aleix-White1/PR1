package uoc.ds.pr.model;

import uoc.ds.pr.CTTCompaniesJobs;

import java.time.LocalDate;

public class Request {
    private String id;
    private String jobOfferId;
    private String companyId;
    private String description;
    private Qualification minQualification;
    private int maxWorkers;
    private LocalDate startDate;
    private LocalDate endDate;


}
