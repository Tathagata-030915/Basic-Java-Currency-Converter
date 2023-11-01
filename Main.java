import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

abstract class CurrencyConverter {
    private double conversionRate;

    public CurrencyConverter(double rate) {
        this.conversionRate = rate;
    }

    public abstract double convertTo(double amount);

    public abstract double convertFrom(double amount);

    public double getConversionRate() {
        return conversionRate;
    }
}

class INR_USD_CurrencyConverter extends CurrencyConverter {
    public INR_USD_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class USD_INR_CurrencyConverter extends CurrencyConverter {
    public USD_INR_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class INR_GBP_CurrencyConverter extends CurrencyConverter {
    public INR_GBP_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class GBP_INR_CurrencyConverter extends CurrencyConverter {
    public GBP_INR_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class INR_EURO_CurrencyConverter extends CurrencyConverter {
    public INR_EURO_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class EURO_INR_CurrencyConverter extends CurrencyConverter {
    public EURO_INR_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class INR_JPY_CurrencyConverter extends CurrencyConverter {
    public INR_JPY_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class JPY_INR_CurrencyConverter extends CurrencyConverter {
    public JPY_INR_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class USD_GBP_CurrencyConverter extends CurrencyConverter {
    public USD_GBP_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class GBP_USD_CurrencyConverter extends CurrencyConverter {
    public GBP_USD_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class USD_EURO_CurrencyConverter extends CurrencyConverter {
    public USD_EURO_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class EURO_USD_CurrencyConverter extends CurrencyConverter {
    public EURO_USD_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class USD_JPY_CurrencyConverter extends CurrencyConverter {
    public USD_JPY_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class JPY_USD_CurrencyConverter extends CurrencyConverter {
    public JPY_USD_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class EURO_GBP_CurrencyConverter extends CurrencyConverter {
    public EURO_GBP_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class GBP_EURO_CurrencyConverter extends CurrencyConverter {
    public GBP_EURO_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class EURO_JPY_CurrencyConverter extends CurrencyConverter {
    public EURO_JPY_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class JPY_EURO_CurrencyConverter extends CurrencyConverter {
    public JPY_EURO_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class GBP_JPY_CurrencyConverter extends CurrencyConverter {
    public GBP_JPY_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}

class JPY_GBP_CurrencyConverter extends CurrencyConverter {
    public JPY_GBP_CurrencyConverter(double rate) {
        super(rate);
    }

    @Override
    public double convertTo(double amount) {
        return amount * getConversionRate();
    }

    @Override
    public double convertFrom(double amount) {
        return amount / getConversionRate();
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            // Read the conversion rates from files

            //INR conversions both ways
            double inr_usd_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/inr_usd_conversion_rate.txt");
            double usd_inr_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/usd_inr_conversion_rate.txt");
            double inr_gbp_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/inr_gbp_conversion_rate.txt");
            double gbp_inr_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/gbp_inr_conversion_rate.txt");
            double inr_euro_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/inr_euro_conversion_rate.txt");
            double euro_inr_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/euro_inr_conversion_rate.txt");
            double inr_jpy_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/inr_jpy_conversion_rate.txt");
            double jpy_inr_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/jpy_inr_conversion_rate.txt");

            //USD conversions both ways
            double usd_gbp_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/usd_gbp_conversion_rate.txt");
            double gbp_usd_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/gbp_usd_conversion_rate.txt");
            double usd_euro_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/usd_euro_conversion_rate.txt");
            double euro_usd_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/euro_usd_conversion_rate.txt");
            double usd_jpy_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/usd_jpy_conversion_rate.txt");
            double jpy_usd_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/jpy_usd_conversion_rate.txt");

            //EURO conversions both ways
            double euro_gbp_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/euro_gbp_conversion_rate.txt");
            double gbp_euro_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/gbp_euro_conversion_rate.txt");
            double euro_jpy_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/euro_jpy_conversion_rate.txt");
            double jpy_euro_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/jpy_euro_conversion_rate.txt");

            //GBP conversions both ways
            double gbp_jpy_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/gbp_jpy_conversion_rate.txt");
            double jpy_gbp_rate = readConversionRate("C:/Users/TATHAGATA GHOSH/Desktop/Currency_converter_2/src/jpy_gbp_conversion_rate.txt");

            CurrencyConverter inr_usd_Converter = new INR_USD_CurrencyConverter(inr_usd_rate);
            CurrencyConverter usd_inr_Converter = new USD_INR_CurrencyConverter(usd_inr_rate);
            CurrencyConverter inr_gbp_Converter = new INR_GBP_CurrencyConverter(inr_gbp_rate);
            CurrencyConverter gbp_inr_Converter = new GBP_INR_CurrencyConverter(gbp_inr_rate);
            CurrencyConverter inr_euro_Converter = new INR_EURO_CurrencyConverter(inr_euro_rate);
            CurrencyConverter euro_inr_Converter = new EURO_INR_CurrencyConverter(euro_inr_rate);
            CurrencyConverter inr_jpy_Converter = new INR_JPY_CurrencyConverter(inr_jpy_rate);
            CurrencyConverter jpy_inr_Converter = new JPY_INR_CurrencyConverter(jpy_inr_rate);
            CurrencyConverter usd_gbp_Converter = new USD_GBP_CurrencyConverter(usd_gbp_rate);
            CurrencyConverter gbp_usd_Converter = new GBP_USD_CurrencyConverter(gbp_usd_rate);
            CurrencyConverter usd_euro_Converter = new USD_EURO_CurrencyConverter(usd_euro_rate);
            CurrencyConverter euro_usd_Converter = new EURO_USD_CurrencyConverter(euro_usd_rate);
            CurrencyConverter usd_jpy_Converter = new USD_JPY_CurrencyConverter(usd_jpy_rate);
            CurrencyConverter jpy_usd_Converter = new JPY_USD_CurrencyConverter(jpy_usd_rate);
            CurrencyConverter euro_gbp_Converter = new EURO_GBP_CurrencyConverter(euro_gbp_rate);
            CurrencyConverter gbp_euro_Converter = new GBP_EURO_CurrencyConverter(gbp_euro_rate);
            CurrencyConverter euro_jpy_Converter = new EURO_JPY_CurrencyConverter(euro_jpy_rate);
            CurrencyConverter jpy_euro_Converter = new JPY_EURO_CurrencyConverter(jpy_euro_rate);
            CurrencyConverter gbp_jpy_Converter = new GBP_JPY_CurrencyConverter(gbp_jpy_rate);
            CurrencyConverter jpy_gbp_Converter = new JPY_GBP_CurrencyConverter(jpy_gbp_rate);

            // Get user input
            System.out.println();
            System.out.println("####################__JAVA CURRENCY CONVERTER__####################");
            System.out.println();
            double amountToConvert = getUserInput("Enter the amount: ");
            int fromCurrencyChoice = getUserCurrencyChoice("Select the source currency: ");
            int toCurrencyChoice = getUserCurrencyChoice("Select the destination currency: ");

            double convertedAmount = 0.0;
            String fromCurrency = "";
            String toCurrency = "";

            switch (fromCurrencyChoice) {
                case 1:
                    fromCurrency = "INR";
                    break;
                case 2:
                    fromCurrency = "USD";
                    break;
                case 3:
                    fromCurrency = "Euro";
                    break;
                case 4:
                    fromCurrency = "GBP";
                    break;
                case 5:
                    fromCurrency = "JPY";
                    break;
                default:
                    System.err.println("Invalid source currency choice.");
                    return;
            }

            switch (toCurrencyChoice) {
                case 1:
                    toCurrency = "INR";
                    break;
                case 2:
                    toCurrency = "USD";
                    break;
                case 3:
                    toCurrency = "Euro";
                    break;
                case 4:
                    toCurrency = "GBP";
                    break;
                case 5:
                    toCurrency = "JPY";
                    break;
                default:
                    System.err.println("Invalid destination currency choice.");
                    return;
            }


            if (fromCurrencyChoice == 1 && toCurrencyChoice == 2) {
                convertedAmount = inr_usd_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 2 && toCurrencyChoice == 1) {
                convertedAmount = usd_inr_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 1 && toCurrencyChoice == 3) {
                convertedAmount = inr_euro_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 3 && toCurrencyChoice == 1) {
                convertedAmount = euro_inr_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 1 && toCurrencyChoice == 4) {
                convertedAmount = inr_gbp_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 4 && toCurrencyChoice == 1) {
                convertedAmount = gbp_inr_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 1 && toCurrencyChoice == 5) {
                convertedAmount = inr_jpy_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 5 && toCurrencyChoice == 1) {
                convertedAmount = jpy_inr_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 2 && toCurrencyChoice == 3) {
                convertedAmount = usd_euro_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 3 && toCurrencyChoice == 2) {
                convertedAmount = euro_usd_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 2 && toCurrencyChoice == 4) {
                convertedAmount = usd_gbp_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 4 && toCurrencyChoice == 2) {
                convertedAmount = gbp_usd_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 2 && toCurrencyChoice == 5) {
                convertedAmount = usd_jpy_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 5 && toCurrencyChoice == 2) {
                convertedAmount = jpy_usd_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 3 && toCurrencyChoice == 4) {
                convertedAmount = euro_gbp_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 4 && toCurrencyChoice == 3) {
                convertedAmount = gbp_euro_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 3 && toCurrencyChoice == 5) {
                convertedAmount = euro_jpy_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 5 && toCurrencyChoice == 3) {
                convertedAmount = jpy_euro_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 4 && toCurrencyChoice == 5) {
                convertedAmount = gbp_jpy_Converter.convertTo(amountToConvert);
            } else if (fromCurrencyChoice == 5 && toCurrencyChoice == 4) {
                convertedAmount = jpy_gbp_Converter.convertTo(amountToConvert);
            }



            System.out.printf("%.2f %s is equivalent to %.2f %s.\n", amountToConvert, fromCurrency, convertedAmount, toCurrency);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: Unable to read conversion rates from files or invalid rates.");
        }
    }

    private static double getUserInput(String prompt) {
        System.out.print(prompt);
        try {
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
            return Double.parseDouble(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Invalid input. Please enter a valid number.");
            return getUserInput(prompt);
        }
    }

    private static int getUserCurrencyChoice(String prompt) {
        System.out.println(prompt);
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. Euro");
        System.out.println("4. GBP");
        System.out.println("5. JPY");
        System.out.print("Enter your choice: ");

        try {
            BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println("Invalid choice. Please enter a valid number.");
            return getUserCurrencyChoice(prompt);
        }
    }

    private static double readConversionRate(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        double rate = Double.parseDouble(reader.readLine());
        reader.close();
        return rate;
    }
}
