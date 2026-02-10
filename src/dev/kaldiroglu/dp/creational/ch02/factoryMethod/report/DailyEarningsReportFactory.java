package dev.kaldiroglu.dp.creational.ch02.factoryMethod.report;

import java.time.LocalDate;

public class DailyEarningsReportFactory implements ReportFactory{
    @Override
    public Report generateReport() {
        return new DailyEarningsReport("Daily Earnings Report for " + LocalDate.now());
    }
}
