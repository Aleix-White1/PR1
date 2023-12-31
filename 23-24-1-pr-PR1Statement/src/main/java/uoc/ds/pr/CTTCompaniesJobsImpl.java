package uoc.ds.pr;

import edu.uoc.ds.traversal.Iterator;
import uoc.ds.pr.exceptions.*;
import uoc.ds.pr.model.Company;
import uoc.ds.pr.model.Request;
import uoc.ds.pr.model.Worker; //Clase importada de models

import java.time.LocalDate;

public class CTTCompaniesJobsImpl implements CTTCompaniesJobs {
    private Worker[] worker; // Declarar el array Workers
    private Company[] companies;
    private Request[] requests;


    public CTTCompaniesJobsImpl(){
        worker = new Worker[MAX_NUM_WORKERS]; // Inicializar el array Workers con el numero maximo
        companies = new Company[MAX_NUM_COMPANIES];
        requests = new Request[]


    }
    @Override
    public void addWorker(String id, String name, String surname, LocalDate dateOfBirth, Qualification qualification) {
        Worker worker = getWorker(id);

        if (worker != null){
            worker.setName(name);
            worker.setSurname(surname);
            worker.setDateOfBirth(dateOfBirth);
            worker.setQualification(qualification);
        }else{
            worker = new Worker(id, name, surname, dateOfBirth, qualification);
        }

    }
    @Override
    public void addCompany(String id, String name, String description) {
        Company company = getCompany(id);

        if (company != null){
            company.setName(name);
            company.setDescription(description);
        } else {
            company = new Company(id, name, description);
        }
    }

    @Override
    public void addRequest(String id, String jobOfferId, String companyId, String description, Qualification minQualification, int maxWorkers, LocalDate startDate, LocalDate endDate) throws CompanyNotFoundException {

    }

    @Override
    public Request updateRequest(Status status, LocalDate date, String description) throws NoRequestException {
        return null;
    }

    @Override
    public Response signUpJobOffer(String workerId, String jobOfferId) throws JobOfferNotFoundException, WorkerNotFoundException, WorkerAlreadyEnrolledException {
        return null;
    }

    @Override
    public double getPercentageRejectedRequests() {
        return 0;
    }

    @Override
    public Iterator<JobOffer> getJobOffersByCompany(String companyId) throws NOJobOffersException {
        return null;
    }

    @Override
    public Iterator<JobOffer> getAllJobOffers() throws NOJobOffersException {
        return null;
    }

    @Override
    public Iterator<JobOffer> getJobOffersByWorker(String workerId) throws NOJobOffersException {
        return null;
    }

    @Override
    public void addRating(String workerId, String jobOfferId, int value, String message) throws WorkerNotFoundException, JobOfferNotFoundException, WorkerNOEnrolledException {

    }

    @Override
    public Iterator<Rating> getRatingsByJobOffer(String jobOfferId) throws JobOfferNotFoundException, NORatingsException {
        return null;
    }

    @Override
    public Worker getMostActiveWorker() throws NoWorkerException {
        return null;
    }

    @Override
    public JobOffer getBestJobOffer() throws NOJobOffersException {
        return null;
    }

    @Override
    public Worker getWorker(String id) {
        for (Worker worker : workers){
            if (worker == null){
                return null;
            }else if (worker.is(id)){
                return worker;
            }
        }
        return null;
    }

    @Override
    public Company getCompany(String id) {
        return null;
    }

    @Override
    public JobOffer getJobOffer(String jobOfferId) {
        return null;
    }

    @Override
    public int numWorkers() {
        return 0;
    }

    @Override
    public int numCompanies() {
        return 0;
    }

    @Override
    public int numJobOffers() {
        return 0;
    }

    @Override
    public int numPendingRequests() {
        return 0;
    }

    @Override
    public int numTotalRequests() {
        return 0;
    }

    @Override
    public int numRejectedRequests() {
        return 0;
    }
}
