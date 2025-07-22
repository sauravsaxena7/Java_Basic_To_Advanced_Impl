package com.multithreading.load_multiple_csv_file_data_using_multithreading.reference_test_codes;

public class StatisticsCalculatorRef {
//    public static Map<String, CustomerStats> calculateCustomerStats(List<Purchase> allPurchases) {
//        Map<String, CustomerStats> customerStatsMap = new HashMap<>();
//        for (Purchase purchase : allPurchases) {
//            customerStatsMap.computeIfAbsent(purchase.customerId, CustomerStats::new).addPurchase(purchase);
//        }
//        return customerStatsMap;
//    }
//
//    public static List<CustomerStats> getSortedCustomerStats(Map<String, CustomerStats> customerStatsMap) {
//        List<CustomerStats> sortedCustomerStats = new ArrayList<>(customerStatsMap.values());
//        Collections.sort(sortedCustomerStats);
//        return sortedCustomerStats;
//    }
//
//    public static void printResults(List<Purchase> allPurchases, List<CustomerStats> sortedCustomerStats) {
//        int totalPurchases = allPurchases.size();
//        double totalRevenue = allPurchases.stream().mapToDouble(p -> p.quantity * p.price).sum();
//        double averageRevenue = totalRevenue / totalPurchases;
//
//        System.out.println("Total Number of Purchases: " + totalPurchases);
//        System.out.printf("Total Revenue: %.2f%n", totalRevenue);
//        System.out.printf("Average Revenue per Purchase: %.2f%n", averageRevenue);
//        System.out.println("Customer Statistics (Ordered by Total Revenue):");
//
//        sortedCustomerStats.stream()
//                .limit(10)
//                .forEach(stats -> System.out.printf("CustomerID: %s, Total Revenue: %.2f, Unique Products Purchased: %d%n",
//                        stats.customerId, stats.totalRevenue, stats.uniqueProducts.size()));
//    }
}