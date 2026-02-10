package dev.kaldiroglu.dp.creational.ch02.factoryMethod.report;

import java.time.LocalDate;

public class DailySalesReportFactory implements ReportFactory{

    @Override
    public Report generateReport() {
        return new DailySalesReport("Daily Sales Report for " + LocalDate.now());
    }
}
