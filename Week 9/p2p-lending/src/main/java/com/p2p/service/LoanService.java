package com.p2p.service;
import com.p2p.domain.*;
import java.math.BigDecimal;

public class LoanService {
    // Memberikan nama pada angka 600
    private static final int MINIMUM_CREDIT_SCORE = 600;

    public Loan createLoan(Borrower borrower, BigDecimal amount) {

        // =========================
        // VALIDASI UTAMA (TC-01)
        // =========================
        // Jika borrower belum terverifikasi,
        // maka proses harus dihentikan
        validateBorrower(borrower);

        validateAmount(amount);

        // Membuat objek loan baru
        Loan loan = new Loan();

        // =========================
        // LOGIC SEDERHANA (sementara)
        // =========================
        // Jika credit score tinggi → APPROVED
        // Jika tidak → REJECTED
        if (borrower.hasGoodCreditScore(MINIMUM_CREDIT_SCORE)) {
            loan.approve();
        } else {
            loan.reject();
        }

        return loan;
    }

    private static void validateAmount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid loan amount");
        }
    }

    // =========================
    // PRIVATE VALIDATION METHOD
    // =========================

    private void validateBorrower(Borrower borrower) {
        if (!borrower.canApplyLoan()) {
            throw new IllegalArgumentException("Borrower not verified");
        }

    }
}
