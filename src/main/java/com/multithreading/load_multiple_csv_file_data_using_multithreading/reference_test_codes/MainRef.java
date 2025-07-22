package com.multithreading.load_multiple_csv_file_data_using_multithreading.reference_test_codes;

public class MainRef {
    private static final int NUM_FILES = 5;

//    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(NUM_FILES);
//
//        List<Future<List<Purchase>>> futures = new ArrayList<>();
//
//        List<Purchase> allPurchases = new ArrayList<>();
//
//        // todo
//
//        for(int i=1;i<=NUM_FILES;i++){
//            final int fileName =i;
//            futures.add(executor.submit(()->loadPurchasesFromFile("purchases_part_1.csv"+fileName+".csv")));
//        }
//
//        for(Future<List<Purchase>> fu :futures){
//            try{
//                List<Purchase> purchases = fu.get();
//                allPurchases.addAll(purchases);
//            }catch(Exception e){
//                e.printStackTrace();
//
//            }
//        }
//
//
//
//        executor.shutdown();
//
//        Map<String, CustomerStats> customerStatsMap = StatisticsCalculator.calculateCustomerStats(allPurchases);
//        List<CustomerStats> sortedCustomerStats = StatisticsCalculator.getSortedCustomerStats(customerStatsMap);
//
//        StatisticsCalculator.printResults(allPurchases, sortedCustomerStats);
//    }
}
