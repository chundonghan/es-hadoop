package com.es.hadoop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonTest
{
    static String product_info = "{" + "\"product_name\": \"测试产品02号\"," + "\"product_top_type\": \"1\"," + "\"product_interest_mode\": \"1\"," + "\"product_repayment_type\": \"1\"," + " \"product_start_date\": \"2017-08-31\"," + "\"product_end_date\": \"\"," + "\"product_allow_quota\": \"200\"," + "\"product_keyword\": \"测试产品\"," + "\"product_describe\": \"此产品为开发用测试产品\"," + "\"is_support_ext\": \"1\"," + "\"is_support_prepay\": \"1\"}";

    static String interest = "[{\"sale_city_select\":\"2\",\"sale_city\":[{\"value_meaning\":\"沈阳\",\"value_code\":\"0024\"},{\"value_meaning\":\"大连\",\"value_code\":\"0411\"},{\"value_meaning\":\"长春\",\"value_code\":\"0431\"}],\"sale_city_checked\":[\"0024\",\"0411\",\"0431\"],\"default_interest_rate\":\"1\",\"interest_info_list\":[{\"borrow_deadline\":\"3\",\"borrow_begin_quota\":\"0\",\"borrow_end_quota\":\"20\",\"interest_mode\":\"1\",\"product_interest\":\"11\",\"platform_rate\":\"11\",\"management_rate\":\"11\",\"commission_rate\":\"11\"},{\"borrow_deadline\":\"3\",\"borrow_begin_quota\":\"20\",\"borrow_end_quota\":\"100\",\"interest_mode\":\"1\",\"product_interest\":\"12\",\"platform_rate\":\"12\",\"management_rate\":\"12\",\"commission_rate\":\"12\"},{\"borrow_deadline\":\"6\",\"borrow_begin_quota\":\"0\",\"borrow_end_quota\":\"50\",\"interest_mode\":\"1\",\"product_interest\":\"13\",\"platform_rate\":\"13\",\"management_rate\":\"13\",\"commission_rate\":\"13\"},{\"borrow_deadline\":\"6\",\"borrow_begin_quota\":\"50\",\"borrow_end_quota\":\"200\",\"interest_mode\":\"1\",\"product_interest\":\"14\",\"platform_rate\":\"14\",\"management_rate\":\"14\",\"commission_rate\":\"14\"}]},{\"sale_city_select\":\"2\",\"sale_city\":[{\"value_meaning\":\"沈阳\",\"value_code\":\"0024\"},{\"value_meaning\":\"大连\",\"value_code\":\"0411\"},{\"value_meaning\":\"长春\",\"value_code\":\"0431\"}],\"sale_city_checked\":[\"0431\"],\"default_interest_rate\":\"1\",\"interest_info_list\":[{\"borrow_deadline\":\"12\",\"borrow_begin_quota\":\"0\",\"borrow_end_quota\":\"50\",\"interest_mode\":\"1\",\"product_interest\":\"21\",\"platform_rate\":\"21\",\"management_rate\":\"21\",\"commission_rate\":\"21\"},{\"borrow_deadline\":\"12\",\"borrow_begin_quota\":\"50\",\"borrow_end_quota\":\"200\",\"interest_mode\":\"1\",\"product_interest\":\"22\",\"platform_rate\":\"22\",\"management_rate\":\"22\",\"commission_rate\":\"22\"}]},{\"sale_city_select\":\"3\",\"sale_city\":[{\"value_meaning\":\"本溪\",\"value_code\":\"0414\"},{\"value_meaning\":\"鞍山\",\"value_code\":\"0412\"},{\"value_meaning\":\"抚顺\",\"value_code\":\"0413\"}],\"sale_city_checked\":[\"0414\",\"0412\",\"0413\"],\"default_interest_rate\":\"1\",\"interest_info_list\":[{\"borrow_deadline\":\"3\",\"borrow_begin_quota\":\"0\",\"borrow_end_quota\":\"10\",\"interest_mode\":\"1\",\"product_interest\":\"31\",\"platform_rate\":\"31\",\"management_rate\":\"31\",\"commission_rate\":\"31\"},{\"borrow_deadline\":\"3\",\"borrow_begin_quota\":\"0\",\"borrow_end_quota\":\"30\",\"interest_mode\":\"1\",\"product_interest\":\"32\",\"platform_rate\":\"32\",\"management_rate\":\"32\",\"commission_rate\":\"32\"},{\"borrow_deadline\":\"24\",\"borrow_begin_quota\":\"0\",\"borrow_end_quota\":\"100\",\"interest_mode\":\"1\",\"product_interest\":\"33\",\"platform_rate\":\"33\",\"management_rate\":\"33\",\"commission_rate\":\"33\"},{\"borrow_deadline\":\"24\",\"borrow_begin_quota\":\"100\",\"borrow_end_quota\":\"500\",\"interest_mode\":\"1\",\"product_interest\":\"34\",\"platform_rate\":\"34\",\"management_rate\":\"34\",\"commission_rate\":\"34\"}]}]";

    static String loan_rule = "[{\"effected_city\":[\"0024\",\"0411\",\"0431\"],\"effected_borrow_deadline\":[{\"value_code\":\"0024\",\"borrow_deadline_array\":[\"3\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"}]},{\"value_code\":\"0411\",\"borrow_deadline_array\":[\"3\",\"6\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"}]},{\"value_code\":\"0431\",\"borrow_deadline_array\":[\"3\",\"6\",\"12\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"},{\"borrow_deadline\":\"12\",\"borrow_deadline_meaning\":\"12期\"}]}],\"rule_item_array\":[{\"value_code\":\"gzf\",\"value_meaning\":\"公证费\",\"charging_type\":\"01\",\"fixed_amount\":\"11\",\"only_id\":1503907964000},{\"value_code\":\"txf\",\"value_meaning\":\"他项费\",\"charging_type\":\"02\",\"percentage_rate\":\"12\",\"min_amount\":\"12\",\"max_amount\":\"12\",\"only_id\":1503907964000},{\"value_code\":\"jjf\",\"value_meaning\":\"加急费\",\"charging_type\":\"03\",\"percentage_rate\":\"13\",\"min_amount\":\"13\",\"max_amount\":\"13\",\"only_id\":1503907964000},{\"value_code\":\"xflx\",\"value_meaning\":\"先付利息\",\"charging_type\":\"04\",\"month_number\":\"14\",\"only_id\":1503907964000},{\"value_code\":\"ydf\",\"value_meaning\":\"验点费\",\"charging_type\":\"03\",\"percentage_rate\":\"15\",\"min_amount\":\"15\",\"max_amount\":\"15\",\"only_id\":1503907964000},{\"value_code\":\"bzj\",\"value_meaning\":\"保证金\",\"charging_type\":\"02\",\"percentage_rate\":\"16\",\"min_amount\":\"16\",\"max_amount\":\"16\",\"only_id\":1503907964000},{\"cost_alias\":\"测试\",\"value_code\":\"qt\",\"value_meaning\":\"其他\",\"charging_type\":\"01\",\"fixed_amount\":\"17\",\"only_id\":1503907964000}]},{\"effected_city\":[\"0414\",\"0412\",\"0413\"],\"effected_borrow_deadline\":[{\"value_code\":\"0414\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]},{\"value_code\":\"0412\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]},{\"value_code\":\"0413\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]}],\"rule_item_array\":[{\"value_code\":\"gzf\",\"value_meaning\":\"公证费\",\"charging_type\":\"04\",\"month_number\":\"21\",\"only_id\":1503907964000},{\"value_code\":\"txf\",\"value_meaning\":\"他项费\",\"charging_type\":\"03\",\"percentage_rate\":\"22\",\"min_amount\":\"22\",\"max_amount\":\"22\",\"only_id\":1503907964000},{\"value_code\":\"jjf\",\"value_meaning\":\"加急费\",\"charging_type\":\"02\",\"percentage_rate\":\"23\",\"min_amount\":\"23\",\"max_amount\":\"23\",\"only_id\":1503907964000},{\"value_code\":\"xflx\",\"value_meaning\":\"先付利息\",\"charging_type\":\"01\",\"fixed_amount\":\"24\",\"only_id\":1503907964000},{\"value_code\":\"ydf\",\"value_meaning\":\"验点费\",\"charging_type\":\"02\",\"percentage_rate\":\"25\",\"min_amount\":\"25\",\"max_amount\":\"25\",\"only_id\":1503907964000},{\"value_code\":\"bzj\",\"value_meaning\":\"保证金\",\"charging_type\":\"03\",\"percentage_rate\":\"26\",\"min_amount\":\"26\",\"max_amount\":\"26\",\"only_id\":1503907964000},{\"cost_alias\":\"测试2\",\"value_code\":\"qt\",\"value_meaning\":\"其他\",\"charging_type\":\"04\",\"month_number\":\"27\",\"only_id\":1503907964000}]},{\"effected_city\":[\"0024\",\"0413\"],\"effected_borrow_deadline\":[{\"value_code\":\"0024\",\"borrow_deadline_array\":[\"6\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"}]},{\"value_code\":\"0413\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]}],\"rule_item_array\":[{\"value_code\":\"gzf\",\"value_meaning\":\"公证费\",\"charging_type\":\"01\",\"fixed_amount\":\"31\",\"only_id\":1503907964000},{\"value_code\":\"txf\",\"value_meaning\":\"他项费\",\"charging_type\":\"02\",\"percentage_rate\":\"32\",\"min_amount\":\"32\",\"max_amount\":\"32\",\"only_id\":1503907964000},{\"value_code\":\"jjf\",\"value_meaning\":\"加急费\",\"charging_type\":\"01\",\"fixed_amount\":\"33\",\"only_id\":1503907964000},{\"value_code\":\"xflx\",\"value_meaning\":\"先付利息\",\"charging_type\":\"01\",\"fixed_amount\":\"\",\"only_id\":1503907964000},{\"value_code\":\"ydf\",\"value_meaning\":\"验点费\",\"charging_type\":\"01\",\"fixed_amount\":\"\",\"only_id\":1503907964000},{\"value_code\":\"bzj\",\"value_meaning\":\"保证金\",\"charging_type\":\"01\",\"fixed_amount\":\"\",\"only_id\":1503907964000},{\"cost_alias\":\"\",\"value_code\":\"qt\",\"value_meaning\":\"其他\",\"charging_type\":\"01\",\"fixed_amount\":\"\",\"only_id\":1503907964000}]}]";

    static String ext = "[{\"effected_city\":[\"0024\",\"0411\",\"0431\"],\"effected_borrow_deadline\":[{\"value_code\":\"0024\",\"borrow_deadline_array\":[\"3\",\"6\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"}]},{\"value_code\":\"0411\",\"borrow_deadline_array\":[\"3\",\"6\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"}]},{\"value_code\":\"0431\",\"borrow_deadline_array\":[\"3\",\"6\",\"12\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"},{\"borrow_deadline\":\"12\",\"borrow_deadline_meaning\":\"12期\"}]}],\"ext_table_list\":[{\"ext_number\":\"1\",\"loan_quota_change\":\"1\",\"loan_quota_change_start\":\"1\",\"loan_quota_change_end\":\"2\",\"interest_change\":\"2\",\"interest_value\":\"\",\"commission_rate_change\":\"1\",\"commission_rate_value\":\"4\",\"platform_fee_type\":\"0\",\"commission_pay_type\":\"0\",\"only_id\":1503907964000},{\"ext_number\":\"2\",\"loan_quota_change\":\"0\",\"interest_change\":\"1\",\"interest_value\":\"2\",\"commission_rate_change\":\"2\",\"commission_rate_value\":\"\",\"platform_fee_type\":\"2\",\"platform_fee_value\":\"\",\"commission_pay_rate\":\"5\",\"commission_pay_type\":\"0,1\",\"only_id\":1503907964000},{\"ext_number\":\"3\",\"loan_quota_change\":\"0\",\"interest_change\":\"0\",\"commission_rate_change\":\"0\",\"platform_fee_type\":\"1\",\"platform_fee_value\":\"7\",\"commission_pay_rate\":\"6\",\"commission_pay_type\":\"1\",\"only_id\":1503907964000}]},{\"effected_city\":[\"0414\",\"0412\",\"0413\"],\"effected_borrow_deadline\":[{\"value_code\":\"0414\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]},{\"value_code\":\"0412\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]},{\"value_code\":\"0413\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]}],\"ext_table_list\":[{\"ext_number\":\"1\",\"loan_quota_change\":\"0\",\"interest_change\":\"0\",\"commission_rate_change\":\"0\",\"platform_fee_type\":\"0\",\"commission_pay_type\":\"0\",\"only_id\":1503907964000},{\"ext_number\":\"2\",\"loan_quota_change\":\"0\",\"interest_change\":\"0\",\"commission_rate_change\":\"0\",\"platform_fee_type\":\"0\",\"commission_pay_type\":\"0\",\"only_id\":1503907964000}]}]";

    static String prepay = "[{\"effected_city\":[\"0024\"],\"effected_borrow_deadline\":[{\"value_code\":\"0024\",\"borrow_deadline_array\":[\"3\",\"6\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"}]}],\"prepay_table_list\":[{\"prepay_stage\":\"1\",\"prepay_rule\":\"0\",\"only_id\":1503907964000},{\"prepay_stage\":\"2\",\"prepay_rule\":\"0\",\"only_id\":1503907964000}]},{\"effected_city\":[\"0411\",\"0431\"],\"effected_borrow_deadline\":[{\"value_code\":\"0411\",\"borrow_deadline_array\":[\"3\",\"6\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"}]},{\"value_code\":\"0431\",\"borrow_deadline_array\":[\"3\",\"6\",\"12\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"6\",\"borrow_deadline_meaning\":\"6期\"},{\"borrow_deadline\":\"12\",\"borrow_deadline_meaning\":\"12期\"}]}],\"prepay_table_list\":[{\"prepay_stage\":\"1\",\"prepay_rule\":\"1\",\"prepay_rule_content\":\"1\",\"deadline_month_number\":\"1\",\"only_id\":1503907964000},{\"prepay_stage\":\"2\",\"prepay_rule\":\"2\",\"prepay_rule_content\":\"1\",\"principal_percentage_rate\":\"1\",\"only_id\":1503907964000}]},{\"effected_city\":[\"0414\",\"0412\",\"0413\"],\"effected_borrow_deadline\":[{\"value_code\":\"0414\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]},{\"value_code\":\"0412\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]},{\"value_code\":\"0413\",\"borrow_deadline_array\":[\"3\",\"24\"],\"borrow_deadline_list\":[{\"borrow_deadline\":\"3\",\"borrow_deadline_meaning\":\"3期\"},{\"borrow_deadline\":\"24\",\"borrow_deadline_meaning\":\"24期\"}]}],\"prepay_table_list\":[{\"prepay_stage\":\"1\",\"prepay_rule\":\"2\",\"prepay_rule_content\":\"2\",\"dynamic_prepay_rule_content\":[{\"deadline_percentage_rate\":\"50\",\"principal_percentage_rate\":\"3\"},{\"deadline_percentage_rate\":\"20\",\"principal_percentage_rate\":\"2\"}],\"only_id\":1503907964000},{\"prepay_stage\":\"2\",\"prepay_rule\":\"2\",\"prepay_rule_content\":\"2\",\"dynamic_prepay_rule_content\":[{\"deadline_percentage_rate\":\"75\",\"principal_percentage_rate\":\"4\"},{\"deadline_percentage_rate\":\"50\",\"principal_percentage_rate\":\"3\"},{\"deadline_percentage_rate\":\"25\",\"principal_percentage_rate\":\"2\"}],\"only_id\":1503907964000}]}]";
    private static String get32UUID()
    {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }

    public static void main(String[] args)
    {
        Gson g = new Gson();
        JsonParser parser = new JsonParser();
        
        JsonArray prepay_array = parser.parse(prepay).getAsJsonArray();
        
        List<Map<String, Object>> prepay_list = new ArrayList<>();
        Map<String, Object> prepay_map;
        Map<String, Object> prepay_item_map;
        Map<String, Object> sale_city_map;
        Map<String, Object> borrow_deadline_map;
        Map<String, Object> prepay_detail_map;
        Map<String, Object> dynamic_prepay_rule_content_map;
        List<Map<String, Object>> dynamic_prepay_rule_content_list;
        for (JsonElement je : prepay_array)
        {
            JsonObject json = je.getAsJsonObject();
            JsonArray effected_borrow_deadline_array = json.get("effected_borrow_deadline").getAsJsonArray();
            prepay_map = new HashMap<>();
            prepay_map.put("only_id", get32UUID());
            JsonArray prepay_table = json.get("prepay_table_list").getAsJsonArray();
            for (JsonElement effected_borrow_deadline_je : effected_borrow_deadline_array)
            {
                sale_city_map = new HashMap<>();
                JsonObject effected_borrow_deadline_json = effected_borrow_deadline_je.getAsJsonObject();
                String sale_city = effected_borrow_deadline_json.get("value_code").getAsString();
                sale_city_map.put("sale_city", sale_city);
                JsonArray borrow_deadline_array = effected_borrow_deadline_json.get("borrow_deadline_array").getAsJsonArray();

                for (JsonElement borrow_deadline_array_je : borrow_deadline_array)
                {
                    borrow_deadline_map = new HashMap<>();
                    borrow_deadline_map.put("borrow_deadline", borrow_deadline_array_je.getAsString());
                    for (JsonElement prepay_table_je : prepay_table)
                    {
                        prepay_item_map = new HashMap<>();
                        JsonObject prepay_table_json = prepay_table_je.getAsJsonObject();
                        prepay_item_map.put("prepay_stage", prepay_table_json.get("prepay_stage").getAsString());
                        String prepay_rule = prepay_table_json.get("prepay_rule").getAsString();
                        prepay_item_map.put("prepay_rule", prepay_rule);
                        prepay_detail_map = new HashMap<>();
                        if ("1".equals(prepay_rule))
                        {
                            String prepay_rule_content = prepay_table_json.get("prepay_rule_content").getAsString();
                            prepay_detail_map.put("prepay_rule_content", prepay_rule_content);
                            if ("1".equals(prepay_rule_content))
                            {
                                JsonElement deadline_month_number = prepay_table_json.get("deadline_month_number");
                                prepay_detail_map.put("deadline_month_number", "".equals(deadline_month_number.getAsString()) ? 0 : deadline_month_number.getAsInt());

                            }
                            if ("2".equals(prepay_rule_content))
                            {
                                JsonArray dynamic_prepay_rule_content = prepay_table_json.get("dynamic_prepay_rule_content").getAsJsonArray();
                                dynamic_prepay_rule_content_list = new ArrayList<>();
                                for (JsonElement dynamic_prepay_rule_content_je : dynamic_prepay_rule_content)
                                {
                                    dynamic_prepay_rule_content_map = new HashMap<>();
                                    JsonObject dynamic_prepay_rule_content_json = dynamic_prepay_rule_content_je.getAsJsonObject();
                                    JsonElement deadline_percentage_rate = dynamic_prepay_rule_content_json.get("deadline_percentage_rate");
                                    dynamic_prepay_rule_content_map.put("deadline_percentage_rate", "".equals(deadline_percentage_rate.getAsString()) ? 0d : deadline_percentage_rate.getAsDouble());
                                    JsonElement deadline_month_number = dynamic_prepay_rule_content_json.get("deadline_month_number");
                                    dynamic_prepay_rule_content_map.put("deadline_month_number", "".equals(deadline_month_number.getAsString()) ? 0 : deadline_month_number.getAsInt());
                                    dynamic_prepay_rule_content_list.add(dynamic_prepay_rule_content_map);
                                }
                                prepay_detail_map.put("dynamic_prepay_rule_content", dynamic_prepay_rule_content_list);
                            }
                        }
                        if ("2".equals(prepay_rule))
                        {
                            String prepay_rule_content = prepay_table_json.get("prepay_rule_content").getAsString();
                            prepay_detail_map.put("prepay_rule_content", prepay_rule_content);
                            if ("1".equals(prepay_rule_content))
                            {
                                JsonElement principal_percentage_rate = prepay_table_json.get("principal_percentage_rate");
                                prepay_detail_map.put("principal_percentage_rate", "".equals(principal_percentage_rate.getAsString()) ? 0d : principal_percentage_rate.getAsDouble());
                            }
                            if ("2".equals(prepay_rule_content))
                            {
                                JsonArray dynamic_prepay_rule_content = prepay_table_json.get("dynamic_prepay_rule_content").getAsJsonArray();
                                dynamic_prepay_rule_content_list = new ArrayList<>();
                                for (JsonElement dynamic_prepay_rule_content_je : dynamic_prepay_rule_content)
                                {
                                    dynamic_prepay_rule_content_map = new HashMap<>();
                                    JsonObject dynamic_prepay_rule_content_json = dynamic_prepay_rule_content_je.getAsJsonObject();
                                    JsonElement deadline_percentage_rate = dynamic_prepay_rule_content_json.get("deadline_percentage_rate");
                                    dynamic_prepay_rule_content_map.put("deadline_percentage_rate", "".equals(deadline_percentage_rate.getAsString()) ? 0d : deadline_percentage_rate.getAsDouble());
                                    JsonElement principal_percentage_rate = dynamic_prepay_rule_content_json.get("principal_percentage_rate");
                                    dynamic_prepay_rule_content_map.put("principal_percentage_rate", "".equals(principal_percentage_rate.getAsString()) ? 0d : principal_percentage_rate.getAsDouble());
                                    dynamic_prepay_rule_content_list.add(dynamic_prepay_rule_content_map);
                                }
                                prepay_detail_map.put("dynamic_prepay_rule_content", dynamic_prepay_rule_content_list);
                            }

                        }
                        prepay_item_map.put("prepay_detail", prepay_detail_map);
                        prepay_item_map.putAll(borrow_deadline_map);
                        prepay_item_map.putAll(sale_city_map);
                        prepay_item_map.putAll(prepay_map);
                        System.out.println(prepay_item_map);
                        prepay_list.add(prepay_item_map);
                    }
                }

            }
        }
    }
    /*JsonArray interest_array = parser.parse(interest).getAsJsonArray();
    
    List<Map<String, Object>> interest_list = new ArrayList<>();
    Map<String, Object> interest_map;
    for (JsonElement je : interest_array)
    {
        interest_map = new HashMap<>();
        JsonObject json = je.getAsJsonObject();
        String sale_city_select = json.get("sale_city_select").toString();
        int default_interest_rate = json.get("default_interest_rate").getAsInt();
        interest_map.put("only_id", get32UUID());
        interest_map.put("sale_city_select", sale_city_select);
        interest_map.put("default_interest_rate", default_interest_rate);
        List<Object> sale_city_checked_array = g.fromJson(json.get("sale_city_checked"), new TypeToken<List<Object>>()
        {
        }.getType());
        for (Object sale_city : sale_city_checked_array)
        {
            interest_map.put("sale_city", sale_city);
            List<Map<String, Object>> interest_info_list = g.fromJson(json.get("interest_info_list"), new TypeToken<List<Map<String, Object>>>()
            {
            }.getType());
            for (Map<String, Object> interest_info : interest_info_list)
            {
                interest_map.put("borrow_deadline", interest_info.get("borrow_deadline"));
                interest_map.put("borrow_begin_quota", interest_info.get("borrow_begin_quota"));
                interest_map.put("borrow_end_quota", interest_info.get("borrow_end_quota"));
                String interest_mode = interest_info.get("interest_mode") + "";
    
                interest_map.put("interest_mode", interest_mode);
                if ("1".equals(interest_mode))
                {
                    interest_map.put("interest_start_date", 0);
                    interest_map.put("interest_end_date", 0);
                }
                else
                {
                    interest_map.put("interest_start_date", interest_info.get("interest_start_date"));
                    interest_map.put("interest_end_date", interest_info.get("interest_end_date"));
                }
                interest_map.put("product_interest", interest_info.get("product_interest"));
                interest_map.put("platform_rate", interest_info.get("platform_rate"));
                interest_map.put("management_rate", interest_info.get("management_rate"));
                interest_map.put("commission_rate", interest_info.get("commission_rate"));
                interest_list.add(interest_map);
            }
        }
    
    
    }
    System.out.println(interest_list);*/

    /*JsonArray loan_rule_array = parser.parse(loan_rule).getAsJsonArray();
    
    List<Map<String, Object>> loan_rule_list = new ArrayList<>();
    Map<String, Object> loan_rule_item_map;
    Map<String, Object> sale_city_map;
    Map<String, Object> borrow_deadline_map;
    for (JsonElement je : loan_rule_array)
    {
        JsonObject json = je.getAsJsonObject();
        JsonArray effected_borrow_deadline_array = json.get("effected_borrow_deadline").getAsJsonArray();
        JsonArray rule_item_array = json.get("rule_item_array").getAsJsonArray();
    
        for (JsonElement effected_borrow_deadline_je : effected_borrow_deadline_array)
        {
            sale_city_map = new HashMap<>();
            sale_city_map.put("only_id", get32UUID());
            JsonObject effected_borrow_deadline_json = effected_borrow_deadline_je.getAsJsonObject();
            String sale_city = effected_borrow_deadline_json.get("value_code").getAsString();
            sale_city_map.put("sale_city", sale_city);
            JsonArray borrow_deadline_array = effected_borrow_deadline_json.get("borrow_deadline_array").getAsJsonArray();
    
            for (JsonElement borrow_deadline_array_je : borrow_deadline_array)
            {
                borrow_deadline_map = new HashMap<>();
                borrow_deadline_map.put("borrow_deadline", borrow_deadline_array_je.getAsString());
                for (JsonElement rule_item_array_je : rule_item_array)
                {
                    loan_rule_item_map = new HashMap<>();
                    JsonObject rule_item_array_json = rule_item_array_je.getAsJsonObject();
                    String cost_type = rule_item_array_json.get("value_code").getAsString();
                    loan_rule_item_map.put("cost_type", cost_type);
                    if ("qt".equals(cost_type))
                    {
                        loan_rule_item_map.put("cost_alias", rule_item_array_json.get("cost_alias").getAsString());
                    }
                    String charging_type = rule_item_array_json.get("charging_type").getAsString();
                    loan_rule_item_map.put("charging_type", charging_type);
                    if ("01".equals(charging_type))
                    {
                        JsonElement fixed_amount = rule_item_array_json.get("fixed_amount");
                        loan_rule_item_map.put("fixed_amount", "".equals(fixed_amount.getAsString()) ? 0d : fixed_amount.getAsDouble());
                    }
                    if ("02".equals(charging_type) || "03".equals(charging_type))
                    {
                        JsonElement percentage_rate = rule_item_array_json.get("percentage_rate");
                        JsonElement min_amount = rule_item_array_json.get("min_amount");
                        JsonElement max_amount = rule_item_array_json.get("max_amount");
                        loan_rule_item_map.put("percentage_rate", "".equals(percentage_rate.getAsString()) ? 0d : percentage_rate.getAsDouble());
                        loan_rule_item_map.put("min_amount", "".equals(min_amount.getAsString()) ? 0d : min_amount.getAsDouble());
                        loan_rule_item_map.put("max_amount", "".equals(max_amount.getAsString()) ? 0d : max_amount.getAsDouble());
                    }
                    if ("04".equals(charging_type))
                    {
                        JsonElement month_number = rule_item_array_json.get("month_number");
                        loan_rule_item_map.put("month_number", "".equals(month_number.getAsString()) ? 0 : month_number.getAsInt());
                    }
                    loan_rule_item_map.putAll(sale_city_map);
                    loan_rule_item_map.putAll(borrow_deadline_map);
                    System.out.println(loan_rule_item_map); 
                    loan_rule_list.add(loan_rule_item_map);
                }
            }
        }
    }*/
    /*JsonArray ext_array = parser.parse(ext).getAsJsonArray();
    
    List<Map<String, Object>> ext_list = new ArrayList<>();
    Map<String, Object> ext_map;
    Map<String, Object> ext_item_map;
    Map<String, Object> sale_city_map;
    Map<String, Object> borrow_deadline_map;
    for (JsonElement je : ext_array)
    {
        JsonObject json = je.getAsJsonObject();
        JsonArray effected_borrow_deadline_array = json.get("effected_borrow_deadline").getAsJsonArray();
        ext_map = new HashMap<>();
        ext_map.put("only_id", get32UUID());
        JsonArray ext_table = json.get("ext_table_list").getAsJsonArray();
        for (JsonElement effected_borrow_deadline_je : effected_borrow_deadline_array)
        {
            sale_city_map = new HashMap<>();
            JsonObject effected_borrow_deadline_json = effected_borrow_deadline_je.getAsJsonObject();
            String sale_city = effected_borrow_deadline_json.get("value_code").getAsString();
            sale_city_map.put("sale_city", sale_city);
            JsonArray borrow_deadline_array = effected_borrow_deadline_json.get("borrow_deadline_array").getAsJsonArray();
    
            for (JsonElement borrow_deadline_array_je : borrow_deadline_array)
            {
                borrow_deadline_map = new HashMap<>();
                borrow_deadline_map.put("borrow_deadline", borrow_deadline_array_je.getAsString());
                for (JsonElement ext_table_je : ext_table)
                {
                    ext_item_map = new HashMap<>();
                    JsonObject ext_table_json = ext_table_je.getAsJsonObject();
                    ext_item_map.put("ext_number", ext_table_json.get("ext_number").getAsInt());
                    String loan_quota_change = ext_table_json.get("loan_quota_change").getAsString();
                    ext_item_map.put("loan_quota_change", loan_quota_change);
                    if ("1".equals(loan_quota_change))
                    {
                        JsonElement loan_quota_change_start = ext_table_json.get("loan_quota_change_start");
                        JsonElement loan_quota_change_end = ext_table_json.get("loan_quota_change_end");
                        ext_item_map.put("loan_quota_change_start", "".equals(loan_quota_change_start.getAsString()) ? 0d : loan_quota_change_start.getAsDouble());
                        ext_item_map.put("loan_quota_change_end", "".equals(loan_quota_change_end.getAsString()) ? 0d : loan_quota_change_end.getAsDouble());
                    }
                    String interest_change = ext_table_json.get("interest_change").getAsString();
                    ext_item_map.put("interest_change", interest_change);
                    if ("1".equals(interest_change) || "2".equals(interest_change))
                    {
                        JsonElement interest_value = ext_table_json.get("interest_value");
                        ext_item_map.put("interest_value", "".equals(interest_value.getAsString()) ? 0d : interest_value.getAsDouble());
                    }
    
                    String commission_rate_change = ext_table_json.get("commission_rate_change").getAsString();
                    ext_item_map.put("commission_rate_change", commission_rate_change);
                    if ("1".equals(commission_rate_change) || "2".equals(commission_rate_change))
                    {
                        JsonElement commission_rate_value = ext_table_json.get("commission_rate_value");
                        ext_item_map.put("commission_rate_value", "".equals(commission_rate_value.getAsString()) ? 0d : commission_rate_value.getAsDouble());
                    }
                    String platform_fee_type = ext_table_json.get("platform_fee_type").getAsString();
                    ext_item_map.put("platform_fee_type", platform_fee_type);
                    if ("1".equals(platform_fee_type) || "2".equals(platform_fee_type))
                    {
                        JsonElement platform_fee_value = ext_table_json.get("platform_fee_value");
                        ext_item_map.put("platform_fee_value", "".equals(platform_fee_value.getAsString()) ? 0d : platform_fee_value.getAsDouble());
                    }
                    String commission_pay_type = ext_table_json.get("commission_pay_type").getAsString();
                    ext_item_map.put("commission_pay_type", commission_pay_type);
                    String[] commission_pay_type_array = commission_pay_type.split(",");
                    if ("1".equals(commission_pay_type_array[0]) || commission_pay_type_array.length == 2)
                    {
                        JsonElement commission_pay_rate = ext_table_json.get("commission_pay_rate");
                        ext_item_map.put("commission_pay_rate", "".equals(commission_pay_rate.getAsString()) ? 0d : commission_pay_rate.getAsDouble());
    
                    }
                    ext_item_map.putAll(borrow_deadline_map);
                    ext_item_map.putAll(sale_city_map);
                    ext_item_map.putAll(ext_map);
                    System.out.println(ext_item_map);
                    ext_list.add(ext_item_map);
                }
            }
    
        }
    }*/
}
